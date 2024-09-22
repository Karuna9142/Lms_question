package com.karuna;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check strong:- ");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		
		while(num>0)
		{
			int fact = 1;
			int i = 1;
			
			int rem = num%10;
			while(i<=rem)
			{
				fact = fact*i;
				i++;
			}
			num = num/10;
			sum = sum+fact;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not strong number");
		}
	}

}
