package com.interview.multithreading.questions;

public class SequenceOfTwoThreads {
	static boolean t1turn = false;
	
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		
		Thread t1 = new Thread(new Runnable() {

	        @Override
	        public void run() {
	            synchronized (lock) {
	                for (int i = 1; i <= 50; i += 2) {
	                    System.out.println("T1=" + i);
	                    t1turn = false;
	                        try {
	                            lock.notifyAll();
	                            lock.wait();
	                        } catch (InterruptedException e) {
	                        }
	                }
	            }

	        }
	    });
	    Thread t2 = new Thread(new Runnable() {

	        @Override
	        public void run() {
	            synchronized (lock) {
	                for (int i = 2; i <= 50; i += 2) {
	                    if (t1turn) {
	                        try {
	                            lock.wait();
	                        } catch (InterruptedException e) {
	                        }
	                    }
	                    System.out.println("T2=" + i);
	                    t1turn = true;
	                    lock.notifyAll();
	                }
	            }
	        }
	    });
	    t1.start();
	    t2.start();
	}

}
