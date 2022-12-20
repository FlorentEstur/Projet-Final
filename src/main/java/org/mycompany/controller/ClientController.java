package org.mycompany.controller;

import org.apache.camel.ProducerTemplate;
import org.mycompany.service.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	IClientRepository icr;
	
	@Autowired
	ProducerTemplate producerTemplate;

}
