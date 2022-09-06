package com.greatlearning.springMvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello-world";
	}

}
 