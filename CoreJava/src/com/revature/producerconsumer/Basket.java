package com.revature.producerconsumer;

public class Basket {
	private int contents;
	private boolean available = false;
	
	//producer and consumer will be the thread's jobs
	//basket will need a get and put method that producer and consume use
	
	public synchronized int get() {	
		//consumer gets an item if available is true
		//BUT it available is false, WAIT
		while(!available)
		{
			try {
				System.out.println("\t\t\t"+Thread.currentThread().getName());
				wait();				//surround try catch
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		available = false;
		notify();
		return contents;			
	}
								//the content value
	public synchronized void put(int value)
	{
		while(available)
			try {
				System.out.println("\t\t\t"+Thread.currentThread().getName()+" is waiting");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		contents = value;
		available = true;
		notify();			//if our consumer is waiting, we want them to stop waiting
	}
	
	
}
