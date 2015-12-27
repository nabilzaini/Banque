package com.poly.isima.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.isima.dao.CompteRepository;
import com.poly.isima.entities.Client;
import com.poly.isima.entities.Compte;
@Service
public class CompteMetierImpl implements CompteMetier {

	@Autowired
	private CompteRepository compteRepository;

	public Compte saveCompte(Compte compte) {
		compte.setDateCreation(new Date());
		return compteRepository.save(compte);
	}

	@Override
	public Compte getCompte(String code) {
		return compteRepository.findOne(code);
	}

}
