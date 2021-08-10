package com.interview.multithreading.questions;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		BlockingQueue<Integer> bqueue = new ArrayBlockingQueue<Integer>(4);
		
		Producer1 p1 = new Producer1(bqueue);
		Producer2 p2 = new Producer2(bqueue);
		Consumer c = new Consumer(bqueue);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}

class Producer1 implements Runnable {
	
	BlockingQueue<Integer> queue;
	
	public Producer1(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=4;i++) {
			try {
				queue.put(i);
				System.out.println("Producer1:"+i);
			}
			catch (InterruptedException e) {
			}
		}
		
	}
	
}

class Producer2 implements Runnable {
	
	BlockingQueue<Integer> queue;
	
	public Producer2(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		for(int i=5;i<=8;i++) {
			try {
				queue.put(i);
				System.out.println("Producer2:"+i);
			}
			catch (InterruptedException e) {
			}
		}
		
	}
}

class Consumer implements Runnable {
	
	BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		
		int result = 1;
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.size());
				System.out.println("Consumer:"+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}