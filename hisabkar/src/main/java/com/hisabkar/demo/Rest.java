package com.hisabkar.demo;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

	@Autowired
	private MyService service;
	
	@RolesAllowed("admin")
	@RequestMapping(method = RequestMethod.GET ,value = "/test")
	public String test(@RequestParam(name = "des") String des) {
		MyTable s = new MyTable();
		s.setName("Ali is testing");
		service.test(s);
		return "test";
}
	
	
}
