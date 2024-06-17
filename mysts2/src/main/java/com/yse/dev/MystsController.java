package com.yse.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MystsController {

	@GetMapping("/")
	public String myroot() {
		return "hello";
	}
	
	@GetMapping("/greeting")
	public String mygreet() {
		return "안녕하소";
	}
}
