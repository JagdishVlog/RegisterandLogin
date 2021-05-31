package com.jpa.RegisterandLogin.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(UserNotFoundException.class)
	 public ResponseEntity<Object> handleExceptions( UserNotFoundException exception, WebRequest webRequest) {
       ExceptionResponse response = new ExceptionResponse();
       response.setDateTime(LocalDateTime.now());
       response.setMessage("User Not Found ");
       response.setErrorCode("400");
       ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
       return entity;
   }
	
	
	@ExceptionHandler(EmailAndUserNameValidationException.class)
	 public ResponseEntity<Object> handleExceptions( EmailAndUserNameValidationException exception, WebRequest webRequest) {
      ExceptionResponse response = new ExceptionResponse();
      response.setDateTime(LocalDateTime.now());
      response.setMessage("please Check Username & Email");
      response.setErrorCode("404");
      ResponseEntity<Object> entity = new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
      return entity;
  }

	
}
