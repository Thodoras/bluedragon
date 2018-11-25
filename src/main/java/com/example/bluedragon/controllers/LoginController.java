package com.example.bluedragon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index()
	{
		return "Xristinoui <3 <3 <3";
	}
}
