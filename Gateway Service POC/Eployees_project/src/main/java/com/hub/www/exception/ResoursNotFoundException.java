package com.hub.www.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResoursNotFoundException extends RuntimeException{
   private static final long serialVersionUID = 1L;
	public ResoursNotFoundException(String message) {
	 super(message);
  }
}
		

