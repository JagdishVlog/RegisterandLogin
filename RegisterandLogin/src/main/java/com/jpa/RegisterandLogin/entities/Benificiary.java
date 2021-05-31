package com.jpa.RegisterandLogin.entities;

import com.jpa.RegisterandLogin.Utility.BaseEntitySeq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Benificiary extends BaseEntitySeq {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long benificiaryId;
	
	
	@Column
	private Long accountNo;
	
	@Column
	private Long userId;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column
	private String bankname;

	private Double creditAmount;

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	@Column
	private Double balance;

	public Long getBenificiaryId() {
		return benificiaryId;
	}

	public void setBenificiaryId(Long benificiaryId) {
		this.benificiaryId = benificiaryId;
	}

	

	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Benificiary(Long benificiaryId, Long accountID, Long accountNo, Long userId, String ifsccode,
			String bankname, Double balance,Double creditAmount) {
		super();
		this.benificiaryId = benificiaryId;
		this.creditAmount=creditAmount;
		this.accountNo = accountNo;
		this.userId = userId;
		this.bankname = bankname;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Benificiary [benificiaryId=" + benificiaryId + ",  accountNo=" + accountNo
				+ ", userId=" + userId +", bankname=" + bankname + ", balance=" + balance
				+ "]";
	}
	public Benificiary() {
		
	}
	
}
