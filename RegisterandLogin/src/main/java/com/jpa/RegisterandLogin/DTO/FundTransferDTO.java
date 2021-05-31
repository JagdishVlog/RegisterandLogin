package com.jpa.RegisterandLogin.DTO;

import lombok.Data;

@Data
public class FundTransferDTO {

    private Long accountNo;
    private Long toAccount;
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getToAccount() {
        return toAccount;
    }

    public void setToAccount(Long toAccount) {
        this.toAccount = toAccount;
    }

    public Double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Double transferAmount) {
        this.transferAmount = transferAmount;
    }

    private Double transferAmount;

    public FundTransferDTO(Long accountNo, Long toAccount, Double transferAmount, Long userId) {

        this.accountNo = accountNo;
        this.toAccount = toAccount;
        this.transferAmount = transferAmount;
        this.userId=userId;
    }

    public FundTransferDTO() {
    }
}
