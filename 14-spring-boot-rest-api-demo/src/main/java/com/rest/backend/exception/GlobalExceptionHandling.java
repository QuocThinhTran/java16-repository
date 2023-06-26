package com.rest.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handlingException(Exception ex) {
		UserErrorResponse response = new UserErrorResponse(
				                         HttpStatus.BAD_REQUEST.value(), 
				                         ex.getMessage(), 
				                         UserErrorResponse.now("yyyy-MM-dd.'T'HH-mm-ss"));
		return new ResponseEntity<UserErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}
}
