package com.day6_collection;
import java.util.ArrayList;

public class CalculateSum {

	public static void main(String[] args) {

		//.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

     //creating a arrayList of integer
       ArrayList<Integer>number = new ArrayList<Integer>();
       
       //add some value
       number.add(10);
       number.add(23);
       number.add(30);
       number.add(45);
       number.add(50);
       number.add(60);
       
       //declare a varible sumOfEven to store the even number
       int sumOfEven = 0;
       
       //Loop through the list and sum the numbers
       for(int num:number)
       {
    	   //condition to check isEven or not
    	   if(num%2==0)
    		   sumOfEven += num;
       }
       //print sum of even number
       System.out.println("sum of even number is:- "+sumOfEven);
	}

}
