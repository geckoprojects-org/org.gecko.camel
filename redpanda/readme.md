# Redpanda Quickstart Management Script

Ein Shell-Script zur einfachen Verwaltung deines Redpanda Docker Compose Setups.

## Installation

```bash
# Script speichern als redpanda-setup.sh
chmod +x redpanda-setup.sh
```

## Befehle

### Cluster Management

| Befehl                        | Beschreibung                                   |
| ----------------------------- | ---------------------------------------------- |
| `./redpanda-setup.sh start`   | Startet den Redpanda Cluster                   |
| `./redpanda-setup.sh stop`    | Stoppt den Cluster                             |
| `./redpanda-setup.sh restart` | Startet den Cluster neu                        |
| `./redpanda-setup.sh clean`   | Entfernt alle Container, Volumes und Netzwerke |

### Monitoring & Debug

| Befehl                                | Beschreibung                           |
| ------------------------------------- | -------------------------------------- |
| `./redpanda-setup.sh status`          | Zeigt Cluster-Status und Informationen |
| `./redpanda-setup.sh logs`            | Zeigt Logs aller Services              |
| `./redpanda-setup.sh logs redpanda-0` | Zeigt nur Redpanda Logs                |
| `./redpanda-setup.sh logs console`    | Zeigt nur Console Logs                 |
| `./redpanda-setup.sh info`            | Zeigt Verbindungsinformationen         |

### Interaktiv

| Befehl                              | Beschreibung                                   |
| ----------------------------------- | ---------------------------------------------- |
| `./redpanda-setup.sh shell`         | Öffnet interaktive Shell im Redpanda Container |
| `./redpanda-setup.sh console`       | Öffnet die Redpanda Console im Browser         |
| `./redpanda-setup.sh rpk <command>` | Führt rpk Befehle aus                          |

### Topic Management

| Befehl                                          | Beschreibung             |
| ----------------------------------------------- | ------------------------ |
| `./redpanda-setup.sh topics`                    | Erstellt Beispiel-Topics |
| `./redpanda-setup.sh rpk topic list`            | Listet alle Topics       |
| `./redpanda-setup.sh rpk topic create my-topic` | Erstellt neues Topic     |
| `./redpanda-setup.sh rpk topic delete my-topic` | Löscht Topic             |

## Verbindungsinformationen

Nach dem Start des Clusters sind folgende Services verfügbar:

| Service              | URL/Adresse           | Beschreibung                  |
| -------------------- | --------------------- | ----------------------------- |
| **Redpanda Console** | http://localhost:8080 | Web UI für Cluster Management |
| **Kafka API**        | localhost:19092       | Kafka-kompatible API          |
| **HTTP Proxy API**   | localhost:18082       | REST API für Kafka            |
| **Schema Registry**  | localhost:18081       | Schema Management             |
| **Admin API**        | localhost:19644       | Administrative API            |

## Häufige Verwendungsszenarien

### Schnellstart

```bash
# Cluster starten
./redpanda-setup.sh start

# Console im Browser öffnen
./redpanda-setup.sh console

# Status prüfen
./redpanda-setup.sh status
```

### Topic erstellen und testen

```bash
# Topic erstellen
./redpanda-setup.sh rpk topic create test-topic --partitions 3

# Nachrichten senden (interaktiv)
./redpanda-setup.sh rpk topic produce test-topic

# Nachrichten empfangen
./redpanda-setup.sh rpk topic consume test-topic
```

### Troubleshooting

```bash
# Logs in Echtzeit verfolgen
./redpanda-setup.sh logs

# Nur Redpanda Logs
./redpanda-setup.sh logs redpanda-0

# Container Status prüfen
docker compose ps

# Shell für direkte Befehle öffnen
./redpanda-setup.sh shell
```

### Cleanup

```bash
# Nur stoppen (Daten bleiben erhalten)
./redpanda-setup.sh stop

# Komplette Bereinigung (alle Daten werden gelöscht!)
./redpanda-setup.sh clean
```

## RPK Befehle (Beispiele)

```bash
# Cluster Informationen
./redpanda-setup.sh rpk cluster info

# Topic Management
./redpanda-setup.sh rpk topic list
./redpanda-setup.sh rpk topic create events --partitions 6
./redpanda-setup.sh rpk topic describe events

# Producer/Consumer
./redpanda-setup.sh rpk topic produce events
./redpanda-setup.sh rpk topic consume events --from-beginning

# Schema Registry
./redpanda-setup.sh rpk registry schema list
```

## Environment Variables

Das Script setzt automatisch folgende Variablen:

```bash
REDPANDA_IMAGE="docker.redpanda.com/redpandadata/redpanda:v25.2.4"
CONSOLE_IMAGE="docker.redpanda.com/redpandadata/console:v3.2.1"
PROJECT_NAME="redpanda-quickstart-one-broker"
```

## Browser Support

Der `console` Befehl funktioniert auf:

- **macOS**: Verwendet `open`
- **Linux**: Verwendet `xdg-open`
- **Windows**: Verwendet `start` (Git Bash, WSL)

Falls kein Browser-Opener erkannt wird, wird die URL angezeigt zum manuellen Öffnen.

## Hilfe

```bash
# Hilfe anzeigen
./redpanda-setup.sh help
./redpanda-setup.sh --help
./redpanda-setup.sh -h
```

## Voraussetzungen

- Docker
- Docker Compose
- Bash Shell
- `docker-compose.yml` im gleichen Verzeichnis