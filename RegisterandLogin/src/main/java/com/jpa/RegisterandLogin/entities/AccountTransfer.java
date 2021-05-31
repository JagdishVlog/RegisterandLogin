package com.jpa.RegisterandLogin.entities;

import com.jpa.RegisterandLogin.Utility.BaseEntitySeq;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounttransacn")
public class AccountTransfer extends BaseEntitySeq {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountID;
	
	@Column
	private Long accountNo;
	
	@Column
	private Long userId;

	@Column
	private String bankname;
	
	@Column
	private Double balance;

	@Column
	private Long toaccount;
	
	@Column
	private Double transferamount;
	
	public Double getTransferamount() {
		return transferamount;
	}

	public void setTransferamount(Double transferamount) {
		this.transferamount = transferamount;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Long getToaccount() {
		return toaccount;
	}

	public void setToaccount(Long toaccount) {
		this.toaccount = toaccount;
	}

	public Long getAccountID() {
		return accountID;
	}

	public void setAccountID(Long accountID) {
		this.accountID = accountID;
	}



	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public AccountTransfer() {
		
	}
	

	public AccountTransfer(Long accountID, Long accountNo, Long userId, String ifsccode, String bankname,
			Double balance, Long fromaccount, Long toaccount) {
		super();
		this.accountID = accountID;
		this.accountNo = accountNo;
		this.userId = userId;
		this.bankname = bankname;
		this.balance = balance;
		this.toaccount = toaccount;
	}

	@Override
	public String toString() {
		return "AccountTransfer [accountID=" + accountID + ", accountNo=" + accountNo + ", userId=" + userId
				+ ", bankname=" + bankname + ", balance=" + balance +
				 ", toaccount=" + toaccount + "]";
	}
}
