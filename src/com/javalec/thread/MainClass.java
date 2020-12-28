package com.javalec.thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thread test
//		ThreadTest threadTest = new ThreadTest();
//		Thread thread = new Thread(threadTest, "A");
//		thread.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("Mainclass");
		
		//threadtestExtend
//		ThreadTestExtend threadTestEx = new ThreadTestExtend();
//		threadTestEx.setName("A");
//		threadTestEx.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("Mainclass");		
		
		//thread n run
//		ThreadTestN threadTest0 = new ThreadTestN();
//		ThreadTestN threadTest1 = new ThreadTestN();
//		
//		Thread thread0 = new Thread(threadTest0, "A");
//		Thread thread1 = new Thread(threadTest1, "B");
//		
//		thread0.start();
//		thread1.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		System.out.println("MainClass");
		
		//thread vote
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread thread1 = new Thread(voteLocation1, "Location1");
		Thread thread2 = new Thread(voteLocation2, "Location2");
		Thread thread3 = new Thread(voteLocation3, "Location3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
