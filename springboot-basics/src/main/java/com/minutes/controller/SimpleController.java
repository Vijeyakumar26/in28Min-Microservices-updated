package com.minutes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minutes.config.CurrencyServiceConfiguration;

@RestController
public class SimpleController {
	
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@GetMapping(path = "/currency-configuration")
	public CurrencyServiceConfiguration getConfig(){
		return config;
	}
}
