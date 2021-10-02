package com.thommache.sprintboot.app.examen.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.thommache.sprintboot.app.examen.entities.User;
import com.thommache.sprintboot.app.examen.repository.UserRepository;

@Service
public class UserService {

	private static final Logger log = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers() {
		log.info("Getting users--" );
		return userRepository.findAll();
	}

	public User getUserById(Integer userId) {
		log.info("Getting user by id {}" , userId);
		 return userRepository.findById(userId).orElseThrow(() -> 
		 new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("User %d not found", userId)));
	}
	
	

}
