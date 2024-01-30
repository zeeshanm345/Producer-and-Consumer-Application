package com.producerconsumerapplication;

public class Consumer implements Runnable {
	private SharedBuffer buffer;

	public Consumer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		while (true) {
			int element = buffer.consume();
			try {
				Thread.sleep(5000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
