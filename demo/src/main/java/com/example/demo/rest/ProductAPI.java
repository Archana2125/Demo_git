package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductAPI {
	
	@GetMapping("/get")
	public String showProduct() {
		return "product added";
	}
}
