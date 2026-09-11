package com.voterapp.service;

import com.voterapp.exceptions.InvalidVoterIdException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;

public class ElectionBoothImpl implements IElectionBooth {

	@Override
	public boolean checkEligibility(int age,String locality, long voterId) throws InvalidVoterIdException {

		if(checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
		return true;
		
		return false;
	}
	

	private boolean checkAge(int age) throws UnderAgeException
	{
		//if age>18 trow this exception
		if (age<18)
		{
			throw new UnderAgeException("Voter is underage");
		}
		return true;
				
		
		
	}
	
	private boolean checkLocality(String locality)throws LocalityNotFoundException
	{
		//voter should be within this locality
		String[] localities = new String[] {"Jp nagr","Radhanagar","Whitefield"};
		//chck if the locality is same
		for(String nlocality : localities)
		{
		//if not throw exception
			if(locality.equals(nlocality))
				return true;
		}
		throw new LocalityNotFoundException("YOur locality not found");
	
		
	}
	
	private boolean checkVoterId(long voterId) throws VoterIdNotFoundException
	{
		//check if id is b/w 1000-10000 if not throw exception
		if(voterId>1000 && voterId<10000)
		return true;
		throw new VoterIdNotFoundException("invalid voterid");
	}
}
