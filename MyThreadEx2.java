package com.thread.day10;

//Write a program to prints 1 to 10 and sleep for 500ms using thread.

//create a class
class Thread2 extends Thread
{
	//method
	public void run()
	{
		System.out.println("Running smoothly:- ");
		
		for(int i = 1; i<=10; i++)
		{
			//pause for some time to see the effect
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				
				System.out.println(e);
			}
			System.out.println("Thread:- "+i);
		}
		
	}
}

public class MyThreadEx2 {

	public static void main(String[] args) {
		
		// instance of Thread2
		Thread2 t1 = new Thread2();
		
		//starting thread
		t1.start();

	}

}
