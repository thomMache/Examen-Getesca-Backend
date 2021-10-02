package com.thommache.sprintboot.app.examen.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.thommache.sprintboot.app.examen.entities.Client;
import com.thommache.sprintboot.app.examen.repository.ClientRepository;



@Service
public class ClientService {
	
	private static final Logger log = LoggerFactory.getLogger(ClientService.class);
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	public List<Client> getClients(){
		log.info("Getting clients--" );
		return clientRepository.findAll();
	}
	
	
	public Client getClientById(Integer clientId) {
		log.info("Getting client by id {}" , clientId);
		 return clientRepository.findById(clientId).orElseThrow(() -> 
		 new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Client %d not found", clientId)));
		}

}
