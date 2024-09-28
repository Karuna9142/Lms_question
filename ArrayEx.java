package com.exceptionHandling;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
 
		int[]arr = {2,3,4,5,6,7};
		int sum = 0;
		
		for(int i = 0; i<10; i++)
		{
			sum += arr[i];
		}
		
		try
		{
			System.out.println("Accessing an element:- "+arr[6]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Exception get caught");
	}

}
