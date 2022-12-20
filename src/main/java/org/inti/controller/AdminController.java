package org.inti.controller;

import org.apache.camel.ProducerTemplate;
import org.inti.repository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@Autowired
	IAdminRepository iar;
	
	@Autowired
	ProducerTemplate producerTemplate;

}
