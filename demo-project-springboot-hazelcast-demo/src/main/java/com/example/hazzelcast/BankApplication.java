package com.example.hazzelcast;

import com.example.hazzelcast.entity.UserAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.example.hazzelcast"})
//@EntityScan("com.example.hazzelcast.entity")
//@EnableJpaRepositories("com.example.hazzelcast")
//@ComponentScan(basePackages = { "com.example.hazzelcast" })
//@EntityScan("com.example.hazzelcast")

//@EntityScan(basePackages = {"com.example.hazzelcast.entity"}) // add this so the spring boot context knows where to look for entities

public class BankApplication {
//https://www.baeldung.com/java-hazelcast
    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }
    @Bean
    public Map<String, UserAccount> accountMap() {
        return new HashMap<>();
    }

}
