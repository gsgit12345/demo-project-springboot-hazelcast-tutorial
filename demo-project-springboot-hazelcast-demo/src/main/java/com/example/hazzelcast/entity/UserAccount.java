package com.example.hazzelcast.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "UserAccount")
public class UserAccount {
//https://www.youtube.com/watch?v=cO5Pb4bqGCY
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")

    private Long id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "balance")
    private long balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
