package org.inti.controller;

import org.apache.camel.ProducerTemplate;
import org.inti.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	IClientRepository icr;
	
	@Autowired
	ProducerTemplate producerTemplate;

}
