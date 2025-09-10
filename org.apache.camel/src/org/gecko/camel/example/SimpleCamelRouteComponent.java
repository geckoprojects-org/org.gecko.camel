package org.gecko.camel.example;

import org.apache.camel.CamelContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
public class SimpleCamelRouteComponent {

	private static final Logger logger = LoggerFactory.getLogger(SimpleCamelRouteComponent.class);
	
	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private CamelContext camelContext;
	
	@Activate
	public void activate() {
		logger.info("SimpleCamelRouteComponent activated with CamelContext: {}", camelContext.getName());
	}

	@Deactivate
	public void deactivate() {
		logger.info("SimpleCamelRouteComponent deactivated");
	}

}
