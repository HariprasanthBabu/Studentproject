package com.example.studentDetail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class StudentException {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> ageNotFound() {
		return new ResponseEntity<>("Not Available in the id",HttpStatus.NOT_FOUND);
	}

}
