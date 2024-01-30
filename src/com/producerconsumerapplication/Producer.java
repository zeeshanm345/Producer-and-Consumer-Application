package com.producerconsumerapplication;

import java.util.Random;

public class Producer implements Runnable {
	private SharedBuffer buffer;

	public Producer(SharedBuffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		Random random = new Random();
		while (true) {
			int element = random.nextInt(100);
			buffer.produce(element);
			try {
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
