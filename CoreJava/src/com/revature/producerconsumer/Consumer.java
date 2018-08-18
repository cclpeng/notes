package com.revature.producerconsumer;

public class Consumer implements Runnable{

	private Basket basket;
	
	
	
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}

	@Override
	public void run() {
		//get a resource from the basket
		int value = 0;
		for(int i = 0; i > 10; i++)
		{
			value = basket.get();
			System.out.println(Thread.currentThread().getName()+"got: "+ value);
			try {
				Thread.sleep((int)(Math.random()*1500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
