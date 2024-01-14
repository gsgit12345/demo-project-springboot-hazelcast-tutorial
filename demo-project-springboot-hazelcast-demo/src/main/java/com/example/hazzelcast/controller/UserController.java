package com.example.hazzelcast.controller;

import com.example.hazzelcast.entity.UserAccount;
import com.example.hazzelcast.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = { "/get/{accountNumber}" })
    public UserAccount getUser(@PathVariable("accountNumber") String accountNumber) {
        return userRepository.findByAccountNumber(accountNumber);
    }

    @PostMapping("/add")
    public void createUser(@RequestBody UserAccount user) {
        userRepository.save(user);
    }

    @DeleteMapping(path = { "/{accountNumber}" })
    public UserAccount deleteUser(@PathVariable("accountNumber") String accountNumber) {
        return userRepository.deleteByAccountNumber(accountNumber);
    }

}

