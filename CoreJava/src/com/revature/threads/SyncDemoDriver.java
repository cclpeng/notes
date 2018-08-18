package com.revature.threads;

public class SyncDemoDriver {
	//other way than extending Thread class is implement interface Runnable
	
	public static void main(String[] args)
	{
		/*
		 * Using StringTestRunnable as our job
		StringBuilder sbuild = new StringBuilder();
		StringBuilder sbuffer = new StringBuilder();
		Runnable job = new StringTestRunnable(sbuild, sbuffer);
		
		Thread t1 = new Thread(job);	//create a thread, just customize wat to run
		Thread t2 = new Thread(job);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();			//Do this just to ake sure it will terminate
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//how to print out resutl??
		System.out.println("StringBuilder result: ");
		System.out.println(sbuild);
		System.out.println();
		System.out.println("StringBuilder result: ");
		System.out.println(sbuffer);
		
		
		//First will execute more! Because it's synchronized, so only one can access at a time
		*/
		/* Using the Count TestRunnable as our job
		 * */
		
		Count c = new Count();
		Runnable job = new CountTestRunnable(c);
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.start();
		t2.start();
		
//		System.out.println("Count: "+c.count);  	//it's always 0. Because we have three threads
													//and the Incrementing of run takes longer than
													//the print in main.
								//Solution! Use join()
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count: "+c.count);  //now we will not get 5000+5000
		
		//BUT we can just make this synchronized. How?
		//go to the FUNCTION that is giving u problems, and add the keyword synchronized
		//so in COunt, do public "synchronized" void increment()
		
		
		
		
		
		
	}
}
