package com.jpa.RegisterandLogin.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.RegisterandLogin.entities.Benificiary;

@Repository
public interface BenificiaryRepository extends JpaRepository<Benificiary, Long> {

	Benificiary findByUserId(Long userId);

    Benificiary findByAccountNo(Long toAccount);

    Benificiary findByAccountNoAndUserId(Long toAccount, Long userId);
}
