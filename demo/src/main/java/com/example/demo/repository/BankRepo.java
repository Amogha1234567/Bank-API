package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bank;


@Repository

public interface BankRepo extends JpaRepository<Bank,Integer> {
}