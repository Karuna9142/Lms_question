package com.thread.day10;

//Write a program to prints numbers from 0 to 4 using thread

//Create a ThreadEx class
class ThreadEx extends Thread
{
	// method
	public void run()
	{
		System.out.println("Thread is running..");
		
		//Run a for loop to print number 0 to 4.
		for(int i = 0; i<5; i++)
		{
			//pause for a minute to see the effect
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
			//printed i
			System.out.println("Thread:-"+i);
		}
	}
	
}

public class MyThread {

	public static void main(String[] args) {
		//create a thread instance
		ThreadEx t1 = new ThreadEx();
		
		//starting a thread
		t1.start();

	}

}
