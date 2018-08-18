package com.revature.threads;

//you will get an error for implementint Runnable til u implement run cuz interface
public class StringTestRunnable implements Runnable {
	
	StringBuilder sbuild;
	StringBuilder sbuffer;
	
	public StringTestRunnable() {
		super();
	}
	
	public StringTestRunnable(StringBuilder sbuild, StringBuilder sbuffer) {
		super();
		this.sbuild = sbuild;
		this.sbuffer = sbuffer;
	}
	
	@Override 
	public void run() {
		//lets append each a bunch of times
		for(int i = 0; i < 50; i++)
			sbuild = sbuild.append("~");
			sbuffer = sbuffer.append("~");
			
	}
}
