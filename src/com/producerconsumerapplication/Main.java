package com.producerconsumerapplication;

public class Main {

	public static void main(String[] args) {

		SharedBuffer buffer = new SharedBuffer(10);

		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);

		Thread producerThread = new Thread(producer, "Producer Thread");
		Thread consumerthread = new Thread(consumer, "Consumer Thread");

		producerThread.start();
		consumerthread.start();
	}

}
