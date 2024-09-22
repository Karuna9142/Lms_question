package com.karuna;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id, name and salary");
		int id = sc.nextInt();
		
		String name = sc.nextLine();
		sc.next();
		double sal = sc.nextDouble();
		
		Employee e1 = new Employee(01,"Karuna", 23000);
		
		double annualSalary = e1.calculateAnnualSalary();
		e1.setId(id, name);
		
		e1.setSal(sal);
		System.out.println(e1.getId()+ " "+e1.getName());
		System.out.println(e1.getsal());
		
		System.out.println("Annual Salary is:- "+annualSalary);
		
		

	}

}
