package com.day3;

abstract class Vaccine 
{
 int age;
 String nationality;
 
 Vaccine(int age, String nationality)
 {
	 this.age = age;
	 this.nationality = nationality;
 }
 
 public void firstDose()
 {
	if(nationality=="Indian" && age==18)
	{
		System.out.println("You have to pay 250");
	}
	else
	{
		System.out.println("Not eligible for firstdose");
	}
 }
 public void secondDose(boolean firstDoseCompleted)
 {
	 if(firstDoseCompleted)
	 {
		 System.out.println("You are eligible for second dose");
	 }
	 else
	 {
		 System.out.println("Not eligible for second dose");
	 }
 }
 abstract void boosterDose();
 
}
