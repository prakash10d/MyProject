package com.example.demo.exception;


import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {



	@ExceptionHandler(value = BusinessException.class)
	public ResponseEntity<CustomErrorResponse> BusinessExceptionException(BusinessException e) {

		CustomErrorResponse error = new CustomErrorResponse(e.getMessage(),e.getCode());

		error.setTimestamp(LocalDateTime.now());

		error.setStatus((HttpStatus.BAD_REQUEST.value()));

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

	}

}