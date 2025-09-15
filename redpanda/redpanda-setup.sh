#!/bin/bash

# Redpanda Quickstart Management Script
# Based on redpanda-quickstart-one-broker setup

# Environment Variables
export REDPANDA_IMAGE="docker.redpanda.com/redpandadata/redpanda:v25.2.4"
export CONSOLE_IMAGE="docker.redpanda.com/redpandadata/console:v3.2.1"
export PROJECT_NAME="redpanda-quickstart-one-broker"

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

# Helper functions
log() {
    echo -e "${GREEN}[INFO]${NC} $1"
}

warn() {
    echo -e "${YELLOW}[WARN]${NC} $1"
}

error() {
    echo -e "${RED}[ERROR]${NC} $1"
}

info() {
    echo -e "${BLUE}[INFO]${NC} $1"
}

# Check if docker-compose.yml exists
check_compose_file() {
    if [ ! -f docker-compose.yml ]; then
        error "docker-compose.yml not found in current directory!"
        exit 1
    fi
}

# Start Redpanda cluster
start_cluster() {
    check_compose_file
    
    log "🚀 Starting Redpanda cluster..."
    docker compose up -d
    
    log "⏳ Waiting for Redpanda to start..."
    sleep 15
    
    # Wait for Redpanda to be ready
    local retries=30
    local count=0
    
    while [ $count -lt $retries ]; do
        if docker exec redpanda-0 rpk cluster info >/dev/null 2>&1; then
            log "✅ Redpanda is ready!"
            break
        fi
        
        echo -n "."
        sleep 2
        count=$((count + 1))
    done
    
    if [ $count -eq $retries ]; then
        error "Redpanda failed to start within timeout period"
        return 1
    fi
    
    # Create sample topics
    setup_sample_topics
    
    show_connection_info
}

# Setup sample topics
setup_sample_topics() {
    log "📝 Creating sample topics..."
    
    # Create some example topics
    docker exec redpanda-0 rpk topic create events --partitions 3 --replicas 1
    docker exec redpanda-0 rpk topic create logs --partitions 1 --replicas 1
    docker exec redpanda-0 rpk topic create metrics --partitions 6 --replicas 1
    
    log "📋 Available topics:"
    docker exec redpanda-0 rpk topic list
}

# Stop cluster
stop_cluster() {
    log "⏹️  Stopping Redpanda cluster..."
    docker compose stop
    log "✅ Cluster stopped"
}

# Cleanup everything
cleanup() {
    log "🧹 Cleaning up Redpanda cluster..."
    docker compose down -v --remove-orphans
    
    # Optional: remove images
    read -p "Remove Redpanda images as well? (y/N): " -n 1 -r
    echo
    if [[ $REPLY =~ ^[Yy]$ ]]; then
        log "Removing images..."
        docker rmi $REDPANDA_IMAGE $CONSOLE_IMAGE 2>/dev/null || true
    fi
    
    # Clean up unused Docker resources
    docker system prune -f
    
    log "✅ Cleanup complete!"
}

# Show cluster status
show_status() {
    log "📊 Docker Compose Status:"
    docker compose ps
    
    echo ""
    if docker exec redpanda-0 rpk cluster info >/dev/null 2>&1; then
        log "🔍 Redpanda Cluster Info:"
        docker exec redpanda-0 rpk cluster info
        
        echo ""
        log "📋 Topics:"
        docker exec redpanda-0 rpk topic list
        
        echo ""
        log "🔧 Broker Configuration:"
        docker exec redpanda-0 rpk cluster config status
    else
        warn "Redpanda is not responding"
    fi
}

# Show connection information
show_connection_info() {
    echo ""
    log "🎉 Redpanda Quickstart is ready!"
    echo ""
    info "Connection Details:"
    echo "  🌐 Redpanda Console:    http://localhost:8080"
    echo "  📡 Kafka API:           localhost:19092"
    echo "  🔗 HTTP Proxy API:      localhost:18082"
    echo "  📄 Schema Registry:     localhost:18081"
    echo "  ⚙️  Admin API:           localhost:19644"
    echo ""
    info "Quick Commands:"
    echo "  📋 List topics:         docker exec redpanda-0 rpk topic list"
    echo "  📝 Create topic:        docker exec redpanda-0 rpk topic create my-topic"
    echo "  📤 Produce message:     docker exec redpanda-0 rpk topic produce my-topic"
    echo "  📥 Consume messages:    docker exec redpanda-0 rpk topic consume my-topic"
    echo ""
}

# Show logs
show_logs() {
    local service=${1:-""}
    
    if [ -n "$service" ]; then
        log "📄 Showing logs for $service..."
        docker compose logs -f "$service"
    else
        log "📄 Showing logs for all services..."
        docker compose logs -f
    fi
}

# Interactive Redpanda shell
shell() {
    log "🐚 Opening Redpanda shell..."
    docker exec -it redpanda-0 /bin/bash
}

# Open Redpanda Console in browser
open_console() {
    local console_url="http://localhost:8080"
    
    # Check if console is running
    if ! docker compose ps console | grep -q "Up"; then
        error "Redpanda Console is not running. Start the cluster first."
        info "Run: $0 start"
        return 1
    fi
    
    log "🌐 Opening Redpanda Console at $console_url"
    
    # Detect OS and open browser accordingly
    if command -v open >/dev/null 2>&1; then
        # macOS
        open "$console_url"
    elif command -v xdg-open >/dev/null 2>&1; then
        # Linux
        xdg-open "$console_url"
    elif command -v start >/dev/null 2>&1; then
        # Windows (Git Bash, WSL)
        start "$console_url"
    else
        warn "Could not detect browser opener command"
        info "Please open manually: $console_url"
        return 1
    fi
    
    log "✅ Console should open in your default browser"
}

# Run rpk commands
rpk() {
    if [ $# -eq 0 ]; then
        log "💡 Usage: $0 rpk <command>"
        log "Example: $0 rpk topic list"
        return 1
    fi
    
    docker exec redpanda-0 rpk "$@"
}

# Show help
show_help() {
    cat << EOF
Redpanda Quickstart Management Script

Usage: $0 <command>

Commands:
  start       Start the Redpanda cluster
  stop        Stop the cluster
  restart     Restart the cluster
  status      Show cluster status and info
  logs [svc]  Show logs (optionally for specific service)
  shell       Open interactive shell in Redpanda container
  rpk <cmd>   Run rpk command (e.g., 'rpk topic list')
  topics      Create sample topics
  clean       Remove all containers, volumes, and networks
  info        Show connection information
  help        Show this help message

Examples:
  $0 start                    # Start cluster
  $0 logs redpanda-0         # Show Redpanda logs
  $0 rpk topic create test   # Create topic via rpk
  $0 clean                   # Full cleanup

EOF
}

# Main script logic
case "$1" in
    start|up)
        start_cluster
        ;;
    stop)
        stop_cluster
        ;;
    restart)
        stop_cluster
        sleep 3
        start_cluster
        ;;
    status)
        show_status
        ;;
    logs)
        show_logs "$2"
        ;;
    shell)
        shell
        ;;
    rpk)
        shift
        rpk "$@"
        ;;
    topics)
        setup_sample_topics
        ;;
    console)
        open_console
        ;;
    clean|cleanup)
        cleanup
        ;;
    info)
        show_connection_info
        ;;
    help|--help|-h)
        show_help
        ;;
    *)
        error "Unknown command: $1"
        echo ""
        show_help
        exit 1
        ;;
esac
