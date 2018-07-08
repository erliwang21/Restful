package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulTest {
	@RequestMapping("/test")
public @ResponseBody String test() {
	return"Restful Web Service is tested.";
	
}
}
