package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.User;

@Controller
public class formController {

	@RequestMapping(value = "/index")
	public String from() {
		return "form";
	}


	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String submit(User user) {
		System.out.println(user.toString());
		return "ok";
	}
}
