package com.poly.isima.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poly.isima.dao.CompteRepository;
import com.poly.isima.dao.EmployeRepository;
import com.poly.isima.dao.OperationRepository;
import com.poly.isima.entities.Compte;
import com.poly.isima.entities.Employe;
import com.poly.isima.entities.Operation;
import com.poly.isima.entities.Retrait;
import com.poly.isima.entities.Versement;

@Service
public class OperationMetierImpl implements OperationMetier {

	@Autowired
	private OperationRepository operationRepository; 
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;
	
	@Transactional
	public boolean verser(String codeCompte, double montant, Long codeEmploye) {
		Operation operation = new Versement();
		operation.setDateOperation(new Date());
		operation.setMontant(montant);
		Compte compte = compteRepository.findOne(codeCompte);
		Employe employe = employeRepository.findOne(codeEmploye);
		operation.setCompte(compte);
		operation.setEmploye(employe);
		compte.setSolde(compte.getSolde() + montant);
		operationRepository.save(operation);
		return true;
	}

	@Transactional
	public boolean retrait(String codeCompte, double montant, Long codeEmploye) {
		Operation operation = new Retrait();
		operation.setDateOperation(new Date());
		operation.setMontant(montant);
		Compte compte = compteRepository.findOne(codeCompte);
		Employe employe = employeRepository.findOne(codeEmploye);
		operation.setCompte(compte);
		operation.setEmploye(employe);
		if(compte.getSolde() < montant) throw new RuntimeException("Solde Insuffisant");
		compte.setSolde(compte.getSolde() - montant);
		operationRepository.save(operation);
		return true;
	}

	@Override
	public boolean virement(String codeCompte1, String codeCompte2,
			double montant, Long codeEmploye) {
		retrait(codeCompte1, montant, codeEmploye);
		verser(codeCompte2, montant, codeEmploye);
		return true;
	}

}
