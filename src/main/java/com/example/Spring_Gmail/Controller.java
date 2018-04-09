package com.example.Spring_Gmail;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@RequestMapping(value="user", method = RequestMethod.GET)
	public Principal user(Principal user) {
		return user;
	}
	
}
