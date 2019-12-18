package com.panther.smsteurekaclientuser.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private DiscoveryClient discClient;
	
	@Value("${userRole:-}")
	private String userRole;
	
	@GetMapping("/get")
	public String getUsers() {
		return "Users List";
	}
	
	@GetMapping("/get/{id}")
	public String getUser_PathVar(@PathVariable String id) {
		String sResp = "User Id "+id+" with role "+this.userRole;
		return sResp;
	}
	
}
