package com.everis.microservices.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path="/")
	public String myValue() {
		return "hola mundo";
	}
}
