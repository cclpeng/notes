package com.revature.exceptions;

//if we extend runtimeexception instead of just exception, we dont have to handle the exception. itll just
//make a red error message for us during runtime
public class NegativeSpeedException extends Exception {
	//this is a customized exception
	
	private static final long serialVersionUID = 1L;
	
	public NegativeSpeedException(String message)
	{
		super(message);
	}
}
