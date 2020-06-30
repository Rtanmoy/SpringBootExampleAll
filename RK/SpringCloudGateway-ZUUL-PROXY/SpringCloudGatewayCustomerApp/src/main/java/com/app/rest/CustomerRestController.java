package com.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerRestController {
    @Value("${server.port}")
	private String port;
    
	@GetMapping("/info")
	public String showDetails() {
		return "Welcome to Customer Service:"+port;
	}
	
}






