package org.inti.controller;

import org.apache.camel.ProducerTemplate;
import org.inti.model.Gerant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GerantController {

	@Autowired
	ProducerTemplate pte;
	
	@GetMapping("getAllGerant")
	
	
	@PostMapping("saveGerant")
	public void saveGerant(@RequestBody Gerant gerant) {
		System.out.println("gérant sauvegardé");
		pte.requestBody("direct:insert", null, Gerant.class);
	}
}
