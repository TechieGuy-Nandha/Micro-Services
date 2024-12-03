package com.lecturers.info.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class LecturersException extends RuntimeException {
	  private static final long serialVersionUID = 1L;
			public LecturersException(String message) {
			 super(message);
		  }
}
