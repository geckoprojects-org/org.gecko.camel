/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.gecko.camel.example.impl.routes;

import java.util.UUID;

import org.apache.camel.builder.RouteBuilder;
import org.gecko.camel.example.RouteProvider;
import org.osgi.service.component.annotations.Component;

import dragino.DraginoFactory;
import dragino.DraginoLSE01Uplink;
import lorawan.DeviceInfo;
import lorawan.LorawanFactory;

//@Component(property = "camel.route=my")
public class MyRouteProvider implements RouteProvider {

	@Override
	public void configureRoutes(RouteBuilder builder) throws Exception {
		builder.from("timer:hello?period=5000").setBody(e->{
			DraginoLSE01Uplink uplink = DraginoFactory.eINSTANCE.createDraginoLSE01Uplink();
			DeviceInfo di = LorawanFactory.eINSTANCE.createDeviceInfo();
			di.setDeviceName(UUID.randomUUID().toString());
			uplink.setDeviceInfo(di);
			return uplink;
		}).routeId(getRouteId()).log("Timer message: ${body}").to("log:test");
	}

	@Override
	public String getRouteId() {
		return "my-test-route";
	}

}
