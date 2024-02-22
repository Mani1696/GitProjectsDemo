package com.example.GitProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
	@GetMapping(value="/get")
	public String getVlaue() {
		return "Hello";
	}
	

}
