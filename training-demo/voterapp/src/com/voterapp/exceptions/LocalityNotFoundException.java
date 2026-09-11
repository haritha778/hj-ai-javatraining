package com.voterapp.exceptions;

//custom exception
public class LocalityNotFoundException extends InvalidVoterIdException {

	
	
	//add default and paramterised constructor
	public LocalityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalityNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	//add default serial version id
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	

}
