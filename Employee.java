package com.karuna;

public class Employee extends User
{
	private double salary;
	
	Employee(int id, String name, double salary)
	{
		super(id, name);
		this.salary = salary;
		
	}
	 public double calculateAnnualSalary()
	 {
		 return 12*salary;
	 }
    public double getsal()
    {
    	return salary;
    }
    public void setSal(double salary)
    {
    	this.salary = salary;
    }

}
