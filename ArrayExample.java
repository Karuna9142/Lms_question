package com.karuna;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
/*
Question 4 : Declare an array with 10 elements. Get a subarray from an array between index 2 to 6 and find out the 2nd highest number from the sub array.

	  Input: 2 4 5 3 6 7 9 4 5 6

	 Output:

	       Sub array: 5 3 6 7 9

	       2nd Highest element: 7
*/
		int arr[] = {2,4,5,3,6,7,9,4,5,6};
		int temp;
		
		int size = arr.length;
		
		System.out.println("Sub array is:-");
		for(int i = 2; i<=6; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0; i<size; i++)
		{
			for(int j = i+1; j<size; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second largest element is:- "+arr[size-2]);
		
	
	}

}
