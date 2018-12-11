package com.blogspot.javabyrajasekhar;

public class App extends Thread{

	@Override
	public void run() {
	System.out.println("thread info"+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		App app = new App();
		
		Thread thread = new Thread(app);
		thread.start();
		thread.start();
	}
}
