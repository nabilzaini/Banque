package com.poly.isima.metier;

import java.util.List;

import com.poly.isima.entities.Client;

public interface ClientMetier {
	public Client saveClient(Client client);
	public List<Client> listClients();

}
