//$Id$
package com.example.thread;

public class ThreadExample1 {
	private static class MyThread implements Runnable{

		@Override
		public void run() {
			System.out.println("Runnable Way ::::: "+Thread.currentThread().getName());
			
		}
		
	}
	public static void main(String args[]){
		Thread t1 = new Thread(new MyThread(),"New Thread");
		t1.start();
		System.out.println("Main Thread ::::: "+Thread.currentThread().getName());
	}
}
