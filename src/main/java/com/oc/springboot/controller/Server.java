package com.oc.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oc.springboot.model.User;

@RestController
@RequestMapping("/api")
public class Server {

	public static final Logger logger = LoggerFactory.getLogger(Server.class);


	
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		
		List<User> users = new ArrayList<User>(3);
		User u1 = new User (0, "Dilbert", 23, 3000);
		User u2 = new User (1, "Ashok", 29, 4000);
		User u3 = new User (2, "Alice", 33, 5000);
		User u4 = new User (3, "Catbert", 24, 6000);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

}