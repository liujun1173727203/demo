package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class test {
	@RequestMapping(value="test")
	public String test() {
		return "hello world";
	}
}
