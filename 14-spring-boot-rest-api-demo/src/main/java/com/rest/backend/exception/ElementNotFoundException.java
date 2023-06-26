package com.rest.backend.exception;

public class ElementNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6466802557142206864L;
	
	public ElementNotFoundException(String msg) {
		super(msg);
	}

}
