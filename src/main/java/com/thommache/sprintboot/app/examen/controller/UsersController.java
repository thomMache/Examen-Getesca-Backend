package com.thommache.sprintboot.app.examen.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thommache.sprintboot.app.examen.entities.Client;
import com.thommache.sprintboot.app.examen.entities.User;
import com.thommache.sprintboot.app.examen.services.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
	}
	
	
	@GetMapping("/{userId}")
	@ApiOperation(value = "Returns a user for a given user id", response = Client.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200 , message="The record was found"),
			@ApiResponse(code = 404 , message="The record was not found")
	})
	public ResponseEntity<User> getUserById(@PathVariable("userId") Integer userId){
		return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
	}

}
