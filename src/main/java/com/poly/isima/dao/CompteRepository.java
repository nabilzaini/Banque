package com.poly.isima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.isima.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
