package com.tendecoders;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/welcome/madhu")
	public String welcome() {
		return "welcome to sainadha ";
	}
	
	@RequestMapping("/welcome/madhu1")
	public String welcome1() {
		return "welcome to sainadha ";
	}
	@RequestMapping("/welcome/madhu2")
	public String welcome2() {
		return "welcome to sainadha ";
	}
	@RequestMapping("/learning/springFramework")
	public String spring() {
		return "Spring is light weight, spring is framework of framework"
				+ "like structs,hibernate etc."
				+ "there are some modules in spring framework"
				+ "like IOC, DI, AOP,MVC, Etc...";
	}

}
