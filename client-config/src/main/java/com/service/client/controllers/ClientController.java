package com.service.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ClientController {
    
    @Value("${my.greeting.message}")
    String greetingMessage;
    
    @Value("${app.message}")
    String appMessage;
    
    @GetMapping("/client")
	public String clientCall() {		
		log.info("Client ");
		log.info(greetingMessage);
		return "Hi from Client";
	}
}
