package com.karuna;
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number:- ");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
        int max = (num1>num2)?num1:num2;
        System.out.println("Maximum Number is:- "+max);
	}

}
