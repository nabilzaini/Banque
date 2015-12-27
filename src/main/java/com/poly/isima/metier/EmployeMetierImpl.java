package com.poly.isima.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.isima.dao.EmployeRepository;
import com.poly.isima.entities.Employe;
@Service 
public class EmployeMetierImpl implements EmployeMetier {

	@Autowired
	EmployeRepository employeRepository;
	public Employe saveEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	public List<Employe> listEmploye() {
		return employeRepository.findAll();
	}

}
