package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restapi {
	@RequestMapping("/{id}")
	public String hello(@PathVariable("id") String id) {
		return "hello " + id;
	}
}
