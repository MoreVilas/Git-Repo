package com.greatlearning.springMvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class GoodMorningController {
	@RequestMapping("/")
	public String printGoodMorning() {
		return "abc"; //name of the view frontend that needs to be redenderd
	}
	
	@RequestMapping("/goodBye") 
		public String printGoodBye() {
			return "goodbye";
		}
		
	}


