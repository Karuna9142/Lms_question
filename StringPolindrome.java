package com.karuna;
import java.util.Scanner;

public class StringPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:- ");
		
		String str = sc.nextLine();
		String rev = "";
		
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("Polindrome");
		}
		else
		{
			System.out.println("Not Polindrome");
		}
		

	}

}
