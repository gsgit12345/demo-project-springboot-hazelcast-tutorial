package com.example.hazzelcast.controller;

import com.example.hazzelcast.entity.UserAccount;
import com.example.hazzelcast.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Map<String, UserAccount> accountMap;

    @GetMapping(path = { "/get/{accountNumber}" })
    public UserAccount getUser(@PathVariable("accountNumber") String accountNumber) {
        //first check if accountMap has the userAccount details, if yes then return it. Else fetch it from database.
        UserAccount userAccount = (accountMap.get(accountNumber) != null) ? accountMap.get(accountNumber)
                : userRepository.findByAccountNumber(accountNumber);

        return userAccount;
    }

    @PostMapping("/add")
    public void createUser(@RequestBody UserAccount user) {
        accountMap.put(user.getAccountNumber(), user);
        userRepository.save(user);
    }

    @DeleteMapping(path = { "/{accountNumber}" })
    public UserAccount deleteUser(@PathVariable("accountNumber") String accountNumber) {
        accountMap.remove(accountNumber);
        return userRepository.deleteByAccountNumber(accountNumber);
    }

}

