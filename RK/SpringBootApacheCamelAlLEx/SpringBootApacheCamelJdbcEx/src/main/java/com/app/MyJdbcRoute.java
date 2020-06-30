package com.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyJdbcRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		//from("sql:select * from emptab?dataSource=#dsObj")
		from("timer://timer1?repeatCount=2&period=4h")
		.setBody(constant("select * from emptab"))
		.to("jdbc:dataSource")
		.process(ex->{
			Object ob=ex.getIn().getBody();
			System.out.println(ob.toString());
			ex.getOut().setBody(ob.toString());
		})
		.to("jms:queue:two");
		//.to("file:d:/desti?fileName=abc.txt");
		
		
	}
}


