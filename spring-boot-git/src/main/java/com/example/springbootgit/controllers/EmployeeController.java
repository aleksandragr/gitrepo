package com.example.springbootgit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@GetMapping
	public String index() {
		return "Hello from employee";
	}
	
	@GetMapping("/getEmployee")
	public String getEmployee() {
		return "Employee: Aleksandra Grujic Saska123";
	}
}
