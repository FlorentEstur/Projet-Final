package com.inti.route;

import javax.sql.DataSource;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import com.inti.process.ProcessInsert;

public class RouteSave extends RouteBuilder {

	@Autowired
	DataSource dataSource;
	@Override
	public void configure() throws Exception {
		
		
		
		from("direct:insert")
		.process(new ProcessInsert())
		.to("jdbc:dataSource");
		
		
	}

}
