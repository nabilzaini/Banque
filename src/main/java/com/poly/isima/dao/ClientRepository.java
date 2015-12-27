package com.poly.isima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.isima.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
