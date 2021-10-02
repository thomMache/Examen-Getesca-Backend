package com.thommache.sprintboot.app.examen.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thommache.sprintboot.app.examen.entities.Team;
import com.thommache.sprintboot.app.examen.repository.TeamRepository;

@Service
public class TeamService {

private static final Logger log = LoggerFactory.getLogger(TeamService.class);
	
	@Autowired
	private TeamRepository teamRepository;
	
	public List<Team> getTeams() {
		log.info("Getting teams--" );
		return teamRepository.findAll();
	}

}
