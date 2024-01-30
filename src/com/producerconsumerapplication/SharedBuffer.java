package com.producerconsumerapplication;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	private Queue<Integer> buffer;
	private int maxSize;

	public SharedBuffer(int maxSize) {
		this.buffer = new LinkedList<Integer>();
		this.maxSize = maxSize;
	}

	public boolean isFull() {
		return buffer.size() == maxSize;
	}

	public boolean isEmpty() {
		return buffer.isEmpty();
	}

	public void produce(int element) {
		if (!isFull()) {
			buffer.offer(element);
			System.out.println(Thread.currentThread().getName() + "Produced : " + element);
		} else {
			System.out.println(Thread.currentThread().getName() + "Buffer is full");
		}
	}

	public int consume() {
		if (!isEmpty()) {
			int element = buffer.poll();
			System.out.println(Thread.currentThread().getName() + "Consumed: " + element);
			return element;
		} else {
			System.out.println(Thread.currentThread().getName() + "Buffer is empty");
			return -1;
		}

	}

}
