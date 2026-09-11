package com.voterapp.exceptions;

//custom exception
public class VoterIdNotFoundException extends InvalidVoterIdException {

	
	
	//add default and paramterised constructor
	public VoterIdNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoterIdNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	//add default serial version id
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	

}
