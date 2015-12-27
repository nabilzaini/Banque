package com.poly.isima.metier;

import com.poly.isima.entities.Compte;

public interface OperationMetier {
	public boolean verser(String codeCompte, double montant, Long codeEmploye);
	public boolean retrait(String codeCompte, double montant, Long codeEmploye);
	public boolean virement(String codeCompte1, String codeCompte2, double montant, Long codeEmploye);
	

}
