package com.cloud.csye6225.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jainh
 *
 */
@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String sayHello() {
		return "Hello and Welcome to the Easy Note Making application. You can create a new Note by making a POST request to /api/notes endpoint.";
	}
}
