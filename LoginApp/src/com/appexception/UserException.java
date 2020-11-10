package com.appexception;

public class UserException extends Exception {
	private String message;

	public UserException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
