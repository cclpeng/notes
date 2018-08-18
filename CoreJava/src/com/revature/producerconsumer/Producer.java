package com.revature.producerconsumer;

//Producer and Consumer are going to be jobs. If you want anything to be a job, must implement runnable
public class Producer implements Runnable{

	private Basket basket;
	
	
	public Producer() { super(); }
	public Producer(Basket b) {
		this.basket = b;
	}
	@Override
	public void run() {
		//we want this job to put stuff in the basket, like a producer does
		for(int i = 0; i < 10; i++) {
			basket.put(i);
			System.out.println(Thread.currentThread().getName()+" put: "+i);
			try {
				Thread.sleep((int)Math.random()*1500);	//This will just make them try at different times so that maybe producer puts all 5 at once, and getting tkaes longer, dpeding on random gen
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  //generates long, needs int
			
		}
		
	}
	
	
}
