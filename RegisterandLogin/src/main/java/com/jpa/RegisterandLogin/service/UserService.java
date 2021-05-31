package com.jpa.RegisterandLogin.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.jpa.RegisterandLogin.entities.Account;
import com.jpa.RegisterandLogin.entities.LoginStatus;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;


import com.jpa.RegisterandLogin.entities.User;
import com.jpa.RegisterandLogin.exception.EmailAndUserNameValidationException;
import com.jpa.RegisterandLogin.exception.UserNotFoundException;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    public ResponseEntity signUpNewUser(User user) throws EmailAndUserNameValidationException {
        if (StringUtils.isNotBlank(user.getEmail())) {
            User newUser = userRepository.findOneByEmailAndUserName(user.getEmail(), user.getUserName());
            if (newUser != null) {
                if (newUser.getEmail().equals(user.getEmail()) || newUser.getUserName().equals(user.getUserName()))
                    throw new EmailAndUserNameValidationException();
            }
            userRepository.save(user);
        }
        return new ResponseEntity<>("user Successfully Register", HttpStatus.OK);
    }


    public ResponseEntity loginUser(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        if (user == null) {
            throw new UserNotFoundException();
        } else if (user.getEmail().equals(email) && password.equals(user.getPassword())) {
            user.setLoginStatus(LoginStatus.Success);
            userRepository.save(user);
         }
        else
        {
            user.setLoginStatus(LoginStatus.Fail);
        }
        return new ResponseEntity("User Successfully Login", HttpStatus.OK);
    }


    public ResponseEntity getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<Map<String, Object>> userAccountInfo = new ArrayList<>();
        for(User user:userList)
        {
            Map<String, Object> data = new HashMap<>();
            data.put("userName",user.getUserName());
            data.put("userEmail",user.getEmail());
            data.put("city",user.getCity());
            data.put("age",user.getAge());
            Account account = accountRepository.findByUserId(user.getUserId());
            if(account !=null) {
                data.put("userAccountNo", account.getAccountNumber());
                data.put("balance", account.getBalance());
            }
            userAccountInfo.add(data);
        }
        return new  ResponseEntity(userAccountInfo,HttpStatus.OK);
    }
}


