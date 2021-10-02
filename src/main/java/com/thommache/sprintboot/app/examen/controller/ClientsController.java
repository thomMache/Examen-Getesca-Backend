package com.thommache.sprintboot.app.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thommache.sprintboot.app.examen.entities.Client;
import com.thommache.sprintboot.app.examen.services.ClientService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/clients")
public class ClientsController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> getClients(){
		return new ResponseEntity<>(clientService.getClients(), HttpStatus.OK);
	}
	
	
	@GetMapping("/{clientId}")
	@ApiOperation(value = "Returns a client for a given client id", response = Client.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200 , message="The record was found"),
			@ApiResponse(code = 404 , message="The record was not found")
	})
	public ResponseEntity<Client> getClientById(@PathVariable("clientId") Integer clientId){
		return new ResponseEntity<>(clientService.getClientById(clientId), HttpStatus.OK);
	}
	

	
}
