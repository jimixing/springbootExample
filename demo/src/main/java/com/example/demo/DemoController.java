package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;



@RestController
public class DemoController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String helloworld() {
		
		 return "Hello world!";
		
	}
	
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public User users() {
		
		User user=new User();
		user.setId(100);
		user.setName("xiaoming");
		return user;
		
	}
	
	
	
}
