package com.poly.isima.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.isima.dao.ClientRepository;
import com.poly.isima.entities.Client;

@Service
public class ClientMetierImpl implements ClientMetier {
	
	@Autowired
	ClientRepository clientRepository;
	public Client saveClient(Client client) {
	
		return clientRepository.save(client);
	}

	public List<Client> listClients() {
		
		return clientRepository.findAll();
	}

}
