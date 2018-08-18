package com.revature.threads;

public class CountTestRunnable implements Runnable{
	
	Count c;
	
	public CountTestRunnable() {
		super();
	}
	
	public CountTestRunnable(Count c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
		//counter. Providing constructor for Count, then call increment() a lot
		for(int i = 0; i < 5000; i++)
			c.Increment();
	}
}
