package com.flight.exception;
public class AvailabilityNotFoundException extends RuntimeException{
	 private static final long serialVersionUID = 1L;
	 public AvailabilityNotFoundException(String str) {
	        super(str);
	    }

}
