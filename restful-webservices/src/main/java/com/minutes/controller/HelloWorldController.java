package com.minutes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.minutes.beans.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello")
	public String getHello() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloWorldBean getHelloBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-bean/{name}")
	public HelloWorldBean getHelloBeanPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World ,%s", name));
	}
}
