package com.revature.threads;

public class ThreadStateDriver {

	public static void main(String[] args) {
		Thread t1 = new TestThread();	//can do this bcuz Thread is a covariant type of 
		//exploring what you can print about thread
		System.out.println("Thread state: "+t1.getState());	//NEW
		System.out.println("isAlive?: "+ t1.isAlive());     //false because not run yet
		t1.start(); 		
		System.out.println("isAlive?: "+ t1.isAlive()); 	//now alive
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread state: "+t1.getState()); //now its dead because we used join
		System.out.println("isAlive?: "+ t1.isAlive());		//ensuring when its finished, will die
	}

}
