package com.poly.isima.metier;

import java.util.List;

import com.poly.isima.entities.Employe;

public interface EmployeMetier {
	public Employe saveEmploye(Employe employe);

	public List<Employe> listEmploye();

}
