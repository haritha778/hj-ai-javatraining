package com.voterapp.exceptions;

//custom exception
public class UnderAgeException extends InvalidVoterIdException {

	
	
	//add default and paramterised constructor
	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	//add default serial version id
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	

}
