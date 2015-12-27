package com.poly.isima.metier;

import com.poly.isima.entities.Compte;

public interface CompteMetier {
	public Compte saveCompte(Compte compte);
	public Compte getCompte(String code);

}
