package org.inti.controller;

import java.util.List;

import org.apache.camel.ProducerTemplate;
import org.inti.model.Client;
import org.inti.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ClientController {
	
	@Autowired
	IClientRepository icr;
	
	@Autowired
	ProducerTemplate producerTemplate;

	@PostMapping("/saveClient")
	public void saveClient(@RequestBody Client client )
	{
		producerTemplate.requestBody("direct:insert", client,List.class);
	}

}
