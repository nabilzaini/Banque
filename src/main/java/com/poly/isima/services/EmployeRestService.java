package com.poly.isima.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poly.isima.entities.Client;
import com.poly.isima.entities.Employe;
import com.poly.isima.metier.ClientMetier;
import com.poly.isima.metier.EmployeMetier;

@RestController
public class EmployeRestService {

	@Autowired
	private EmployeMetier employeMetier;// Generate delegate methods

 
	@RequestMapping(value="/employes", method=RequestMethod.POST)
	public Employe saveEmploye(@RequestBody Employe employe) {
		
		return employeMetier.saveEmploye(employe);
	}

	@RequestMapping(value="/employes", method=RequestMethod.GET)
	public List<Employe> listEmploye() {
		return employeMetier.listEmploye();
	}

}
