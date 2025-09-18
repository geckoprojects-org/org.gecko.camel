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

import org.apache.camel.builder.RouteBuilder;
import org.eclipse.fennec.demo.addressbook.AddressBookFactory;
import org.eclipse.fennec.demo.addressbook.Contact;
import org.eclipse.fennec.demo.addressbook.ContactType;
import org.eclipse.fennec.demo.addressbook.Person;
import org.gecko.camel.example.RouteProvider;

//@Component(property = "camel.route=my")
public class MyRouteProvider implements RouteProvider {

	@Override
	public void configureRoutes(RouteBuilder builder) throws Exception {
		builder.from("timer:hello?period=5000").setBody(e->{
			Person person = AddressBookFactory.eINSTANCE.createPerson();
			person.setFirstName("Emil");
			person.setLastName("Tester");
			Contact c = AddressBookFactory.eINSTANCE.createContact();
			c.setType(ContactType.MOBILE);
			c.setValue("0172-1234567");
			person.getContacts().add(c);
			return person;
		}).routeId(getRouteId()).log("Timer message: ${body}").to("log:test");
	}

	@Override
	public String getRouteId() {
		return "my-test-route";
	}

}
