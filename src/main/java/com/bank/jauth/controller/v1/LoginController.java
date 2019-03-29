package com.bank.jauth.controller.v1;

import com.bank.jauth.dao.v1.TokenDAO;
import com.bank.jauth.dao.v1.UserDAO;
import com.bank.jauth.model.v1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class LoginController {

	@Autowired
	private TokenDAO tokenRepository;
	@Autowired
	private UserDAO userRepository;


	@RequestMapping(value = "/sign_up", method = RequestMethod.POST)
	public void SignUp(@RequestBody User user) {

	}

	@RequestMapping(value = "/check_email/{mailToken}", method = RequestMethod.GET)
	public boolean CheckEmail(@PathVariable String mailToken) {

		return true;
	}

	@RequestMapping(value = "/sign_in", method = RequestMethod.POST)
	public String SignIn(@RequestBody String username, @RequestBody String password) {

		return null;
	}

	@RequestMapping(value = "/sign_out", method = RequestMethod.POST)
	public void SignOut(@RequestBody String token) {

	}

	@RequestMapping(value = "/check_token", method = RequestMethod.GET)
	public boolean CheckToken(@RequestBody String token) {

		return false;
	}

	@RequestMapping(value = "/one_shot_token", method = RequestMethod.GET)
	public String OneShotToken(@RequestBody String token, @RequestBody String password) {

		return "";
	}

}
