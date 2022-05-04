package com.sample.health.actuatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @GetMapping(path = "/hello")
	public String sendTask() {
        return "hello";
	}


    
}