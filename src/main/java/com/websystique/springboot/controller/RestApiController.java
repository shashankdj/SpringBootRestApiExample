package com.websystique.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.model.User;

@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);

	@Autowired

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers() {
		List<User> users = new ArrayList<User> (3);
		User u1 = new User (0, "Dilbert", 23, 4000);
		User u2 = new User (0, "Ashok", 18, 6000);
		User u3 = new User (0, "Catbert", 34, 30000);
		User u4 = new User (0, "Alice", 25, 9000);
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		
	
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}
