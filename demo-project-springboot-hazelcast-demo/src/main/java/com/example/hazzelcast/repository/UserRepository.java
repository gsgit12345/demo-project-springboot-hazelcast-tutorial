package com.example.hazzelcast.repository;

import com.example.hazzelcast.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserAccount,Long> {
    UserAccount findByAccountNumber(String accountNumber);
    UserAccount deleteByAccountNumber(String accountNumber);

}
