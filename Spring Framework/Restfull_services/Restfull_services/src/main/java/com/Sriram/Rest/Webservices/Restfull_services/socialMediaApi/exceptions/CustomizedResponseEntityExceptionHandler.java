package com.Sriram.Rest.Webservices.Restfull_services.socialMediaApi.exceptions;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
        
	@ExceptionHandler     
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		  ErrorDetails error = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
	     return new ResponseEntity<Object>(error, HttpStatus.INTERNAL_SERVER_ERROR); 	
	}
	
	@ExceptionHandler     
	public final ResponseEntity<Object> handleAllUsernotfoundException(UserNotFoundException ex, WebRequest request) throws Exception {
		  ErrorDetails error = new ErrorDetails(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
	     return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND); 	
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		    ErrorDetails error = new ErrorDetails(LocalDateTime.now(),"Error count:"+ex.getErrorCount()+" ,first error:"+ex.getFieldError().getDefaultMessage(), request.getDescription(false));
//			StringBuilder chunks = new StringBuilder();
//		    for(int i =0;i<ex.getFieldErrors().size(); i++) {
//		    	chunks.append(ex.getFieldErrors().get(i).getDefaultMessage() + ","); 
//			}
		    return new ResponseEntity<Object>(error , HttpStatus.BAD_REQUEST);
              
	}
}
