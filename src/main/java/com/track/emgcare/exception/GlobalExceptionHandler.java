package com.track.emgcare.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ExceptionResponse handleResourceNotFoundException(final ResourceNotFoundException rnfe, HttpServletRequest req) {
		
		ExceptionResponse exRes = new ExceptionResponse();
		exRes.setErrorMessage(rnfe.getMessage());
		exRes.setRequestedURI(req.getRequestURI());
		return exRes;
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ExceptionResponse handleServiceException(final Exception ex,final HttpServletRequest req) {
		
		ExceptionResponse exRes= new ExceptionResponse();
		exRes.setErrorMessage(ex.getMessage());
		exRes.setRequestedURI(req.getRequestURI());
		return exRes;
	}
}
