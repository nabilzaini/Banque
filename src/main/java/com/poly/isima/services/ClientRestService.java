package com.poly.isima.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poly.isima.entities.Client;
import com.poly.isima.metier.ClientMetier;

@RestController
public class ClientRestService {
	
	@Autowired
	private ClientMetier clientMetier;//Generate delegate methods
	@RequestMapping(value="/clients", method=RequestMethod.POST)
	public Client saveClient(@RequestBody Client client) {
		return clientMetier.saveClient(client);
	}
	@RequestMapping(value="/clients", method=RequestMethod.GET)
	public List<Client> listClients() {
		return clientMetier.listClients();
	}

}
