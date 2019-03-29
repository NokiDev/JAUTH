package com.bank.jauth.route.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth/v1")
public class OneShotTokenRoute {

	@GetMapping(path = "/one_shot_token", produces = "application/json")
	public String getAll() {
		return "true";
	}
}