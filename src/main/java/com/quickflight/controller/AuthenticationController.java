package com.quickflight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/authentication")
public class AuthenticationController {
	@RequestMapping(value = "/ad", method = RequestMethod.GET)
	public List<String> names() {
		return new ArrayList<>();
		
	}

}
