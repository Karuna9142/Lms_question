package com.karuna;
import java.util.Scanner;

public class Bank
{
 private double amount;
 Bank(double amount)
 {
	this.amount = amount;
 }
 public void withdraw(double withdrawAmount)
 {
	 String msg = (amount>= withdrawAmount)?"Withdraw Successful":"Insufficient funds";
	 if(amount>=withdrawAmount)
	 {
		 amount = amount-withdrawAmount;
	 }
	 System.out.println(msg);
 }
 public void deposit(double depositAmount)
 {
	 amount = amount+depositAmount;
	 System.out.println("After deposit  total amount is:- "+amount);
 }
 public static void main(String[]args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter amount:- ");
	 
	 double amount = sc.nextDouble();
	 System.out.println("Enter amount to withdraw:- ");
	 double withdraw = sc.nextDouble();
	 
	 System.out.println("Enter deposit amount:- ");
	 double deposit = sc.nextDouble();
	 Bank b1 = new Bank(amount);
	 
	 b1.withdraw(withdraw);
	 b1.deposit(deposit);
 }
}
