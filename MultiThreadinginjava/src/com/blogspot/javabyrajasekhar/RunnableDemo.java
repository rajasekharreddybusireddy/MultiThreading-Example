package com.blogspot.javabyrajasekhar;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		RunnableDemo runnableDemo = new RunnableDemo();
		Thread thread = new Thread(runnableDemo);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("thread info" + Thread.currentThread());
	}

}
