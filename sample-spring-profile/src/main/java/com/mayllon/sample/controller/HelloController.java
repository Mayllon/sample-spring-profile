package com.mayllon.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayllon.sample.service.Lenguage;

@RestController
public class HelloController {

	@Autowired
	private Lenguage lenguage;
	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable(value = "name") String name) {
		return lenguage.hello(name);
	}
	
}
