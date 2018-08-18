package com.revature.producerconsumer;

public class Driver {

		public static void main(String[] args)
		{
			System.out.println(Thread.currentThread().getName());
			
			Basket b = new Basket();
			Runnable producerJob = new Producer(b);
			Runnable consumerJob = new Consumer(b);
			
			Thread producerWorker = new Thread(producerJob, "PRODUCER"); //can name thread
			Thread consumerWorker = new Thread(consumerJob, "CONSUMER)");
			
			//**If the get and Put methods arent synchronized, get an exception
			//because both try to access Basket
			
			producerWorker.start();
			consumerWorker.start();
			
		
			
		}
}
