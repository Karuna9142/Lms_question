package com.exceptionHandling;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:- ");
		
		int n = sc.nextInt();
		int arr[] = new int[n];

		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = i+1;
		}
		for(int i = 0; i<100; i++)
		{
			System.out.println(arr[i]);
		}
	
	}

}
