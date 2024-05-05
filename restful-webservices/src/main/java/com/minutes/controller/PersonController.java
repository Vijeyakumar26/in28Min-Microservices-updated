package com.minutes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minutes.beans.Name;
import com.minutes.beans.PersonV1;
import com.minutes.beans.PersonV2;

@RestController
public class PersonController {
	
	@GetMapping(path = "/v1/persons")
	public PersonV1 getPersonV1() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/v2/persons")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}	
	
	@GetMapping(path = "/persons", params = "version=1")
	public PersonV1 getPersonV1RequestParameter() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/persons", params = "version=2")
	public PersonV2 getPersonV2RequestParameter() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/persons/header", headers = "X-API-VERSION=1")
	public PersonV1 getPersonV1Header() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/persons/header", headers = "X-API-VERSION=2")
	public PersonV2 getPersonV2Header() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/persons/accept", produces = "application/helloworld-v1+json")
	public PersonV1 getPersonV1AcceptHeader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/persons/accept", produces = "application/helloworld-v2+json")
	public PersonV2 getPersonV2AcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
