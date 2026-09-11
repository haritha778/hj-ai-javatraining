package com.voterapp.service;

import com.voterapp.exceptions.InvalidVoterIdException;

public interface IElectionBooth {
	
	boolean checkEligibility(int age, String locality, long voterId) throws InvalidVoterIdException;

}
