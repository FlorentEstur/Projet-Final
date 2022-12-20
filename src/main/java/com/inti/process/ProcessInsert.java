package com.inti.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.inti.model.Client;



public class ProcessInsert implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Client client = exchange.getIn().getBody(Client.class);
		String query = "Insert Into ProductCamel (id, nom, username, password) values ( " + client.getId() + ", '" + client.getNom() + ", '" + client.getUsername() +  ", '" + client.getPassword() + "')";
		exchange.getIn().setBody(query);	
		
		
	}

}
