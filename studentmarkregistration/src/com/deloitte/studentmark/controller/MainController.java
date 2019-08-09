package com.deloitte.studentmark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("hello")
	public String welcome()
	{
		return "Welcome";
	}

}
