package com.jpa.RegisterandLogin.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.RegisterandLogin.entities.AccountTransfer;

@Repository
public interface AccountTransferRepository extends JpaRepository<AccountTransfer, Long>{

	AccountTransfer findByAccountNoAndUserId(Long accountNo, Long long1);

}
