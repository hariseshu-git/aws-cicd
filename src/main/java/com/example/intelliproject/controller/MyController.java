package com.example.intelliproject.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class MyController {

	private static final Logger log = LoggerFactory.getLogger(MyController.class);

	

	@GetMapping("/hello")
	public String sayHello() throws SQLException {
		log.info("In Hello method");
		return "REST call: Hello World";
	}

}
