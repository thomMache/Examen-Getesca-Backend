package com.thommache.sprintboot.app.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thommache.sprintboot.app.examen.entities.Team;
import com.thommache.sprintboot.app.examen.services.TeamService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/teams")
public class TeamsController {
	
	@Autowired
	private TeamService teamService;
	
	
	@GetMapping
	public ResponseEntity<List<Team>> getUsers(){
		return new ResponseEntity<>(teamService.getTeams(), HttpStatus.OK);
	}

}
