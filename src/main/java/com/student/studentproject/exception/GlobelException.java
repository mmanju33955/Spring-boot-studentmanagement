package com.student.studentproject.exception;

import javax.naming.InvalidNameException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobelException {
	@ExceptionHandler(InvalidNameExcetion.class)
	public ResponseEntity<String> InvalidName(InvalidNameException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
