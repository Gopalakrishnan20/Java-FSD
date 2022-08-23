package com.sb;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=ProductException.class)
	public ResponseEntity<Object> exceptionhandler(ProductException e) {
		return new ResponseEntity<>("Product not found",HttpStatus.NOT_FOUND);
	}

}
