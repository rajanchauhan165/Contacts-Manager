package com.cm.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AllExceptionsHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrorDetail> userExceptionHandler(UserException ue, WebRequest wr){
		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setMessage(ue.getMessage());
		errorDetail.setTimeStamp(LocalDateTime.now());
		errorDetail.setDescription(wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetail>(errorDetail,HttpStatus.BAD_REQUEST);
	}
}
