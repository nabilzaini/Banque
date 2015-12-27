package com.poly.isima.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poly.isima.metier.OperationMetier;

@RestController
public class OperationRestService {
	@Autowired
	private OperationMetier operationMetier;

	@RequestMapping(value="/versement", method=RequestMethod.PUT)
	//@RequestParam : parceque ne sont pas des données au format JSON
	public boolean verser(
			@RequestParam String codeCompte, 
			@RequestParam double montant, 
			@RequestParam Long codeEmploye) {
		return operationMetier.verser(codeCompte, montant, codeEmploye);
	}

	@RequestMapping(value="/retrait", method=RequestMethod.PUT)
	public boolean retrait(
			@RequestParam String codeCompte, 
			@RequestParam double montant, 
			@RequestParam Long codeEmploye) {
		return operationMetier.retrait(codeCompte, montant, codeEmploye);
	}
	@RequestMapping(value="/virement", method=RequestMethod.PUT)
	public boolean virement(
			@RequestParam String codeCompte1,
			@RequestParam String codeCompte2,
			@RequestParam double montant,
			@RequestParam Long codeEmploye) {
		return operationMetier.virement(codeCompte1, codeCompte2, montant,
				codeEmploye);
	}

}
