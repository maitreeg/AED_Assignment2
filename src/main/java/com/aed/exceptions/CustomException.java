package com.aed.exceptions;

/**
 *
 * @author mg
 */
public class CustomException extends Exception {
    
    private static final long serialVersionUID = 106976543L;
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(Throwable cause) {
		super(cause);
	}
}
