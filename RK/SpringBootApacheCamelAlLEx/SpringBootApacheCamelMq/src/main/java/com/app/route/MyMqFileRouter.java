package com.app.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyMqFileRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {

		from("file:d:/desti?fileName=mydata.txt")
		.to("jms:queue:one");
		
		/*
		 * from("jms:queue:abc") .to("file:d:/desti?fileName=mydata.txt");
		 */
		
	}
}




