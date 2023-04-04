package com.masai.exception;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptioneHandler {

	@ExceptionHandler(EmployeeExcepione.class)
	 public ResponseEntity<ProblemDetail> handleEmployeeExcepione(EmployeeExcepione excepione){
		 
		ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		problemDetail.setTitle(excepione.getMessage());
//		problemDetail.setDetail("problemDetail");
		problemDetail.setType(URI.create("http://localhost:8888/errors"));
		problemDetail.setProperty("host", "localhost");
		problemDetail.setProperty("port", 8888);
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(problemDetail);
		
	 }
}
