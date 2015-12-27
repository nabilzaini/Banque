package com.poly.isima.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poly.isima.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
