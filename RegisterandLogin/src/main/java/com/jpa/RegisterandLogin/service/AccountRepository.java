package com.jpa.RegisterandLogin.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.RegisterandLogin.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {


    Account findByAccountNumber(Long accountNo);

    Account findByUserId(Long userId);
}
