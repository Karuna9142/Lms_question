package com.day3;

public class VaccinationSuccessful extends Vaccine 
{
 VaccinationSuccessful(int age, String nationality) 
 {
		super(age, nationality);
		
 }

public void boosterDose()
{
	System.out.println("you have successfully received the booster dose");
}
	

}
