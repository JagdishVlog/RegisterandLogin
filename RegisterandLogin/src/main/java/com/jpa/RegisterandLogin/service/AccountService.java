package com.jpa.RegisterandLogin.service;

import java.util.Optional;

import com.jpa.RegisterandLogin.entities.LoginStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jpa.RegisterandLogin.entities.Account;
import com.jpa.RegisterandLogin.entities.User;
import com.jpa.RegisterandLogin.exception.UserNotFoundException;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountrepository;

    @Autowired
    UserRepository userrepository;

    public ResponseEntity saveAccountInfo(Account account) throws UserNotFoundException {
        Optional<User> userId = userrepository.findById(account.getUserid());
        if (userId.isPresent() && LoginStatus.Success.equals(userId.get().getLoginStatus())) {
            accountrepository.save(account);
            return new ResponseEntity("Save Account Information Successfully", HttpStatus.OK);
        }
        throw new UserNotFoundException();
    }


    public Account updateBalance(Double minusBalance, Long accountNo) {
        Account account = accountrepository.findByAccountNumber(accountNo);
        account.setBalance(minusBalance);
        return accountrepository.save(account);
    }
}
