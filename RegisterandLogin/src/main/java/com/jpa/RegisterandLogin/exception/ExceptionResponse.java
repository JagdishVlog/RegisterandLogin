package com.jpa.RegisterandLogin.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

    private String message;
    private LocalDateTime dateTime;
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
	   
}