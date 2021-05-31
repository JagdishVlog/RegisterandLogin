package com.jpa.RegisterandLogin.entities;



import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "accountdetails")
public class Account {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column
    private Long accountNumber;

    @Column
    private String ifcsCode;

    @Column
    private double balance;

    @Column
    private Long userId;


   /* @OneToMany(cascade = CascadeType.ALL ,orphanRemoval = true)
    @JoinColumn(name = "beneficiaryAccount",referencedColumnName = "accountId")
    private List<Benificiary> beneficiaryAccounts;


    public List<Benificiary> getBeneficiaryAccounts() {
        return beneficiaryAccounts;
    }

    public void setBeneficiaryAccounts(List<Benificiary> beneficiaryAccounts) {
        this.beneficiaryAccounts = beneficiaryAccounts;
    }*/

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfcsCode() {
        return ifcsCode;
    }

    public void setIfcsCode(String ifcsCode) {
        this.ifcsCode = ifcsCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getUserid() {
        return userId;
    }

    public void setUserid(Long userId) {
        this.userId = userId;
    }

    public Account(Long accountId, Long accountNumber, String ifcsCode, double balance, Long userId) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.ifcsCode = ifcsCode;
        this.balance = balance;
        this.userId = userId;

    }

    public Account() {
    }
}
