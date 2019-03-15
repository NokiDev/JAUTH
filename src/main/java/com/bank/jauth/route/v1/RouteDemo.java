package com.bank.jauth.route.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth/v1")
public class RouteDemo {

    @GetMapping(path = "/", produces = "application/json")
    public String getAll() {
      return "true";
    }
}