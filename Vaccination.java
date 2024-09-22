package com.day3;
import java.util.Scanner;

public class Vaccination {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		Vaccine v1 = new VaccinationSuccessful(18, "Indian");
		
		v1.firstDose();
		boolean firstDoseCompleted = true;
		
		v1.secondDose(firstDoseCompleted);
		v1.boosterDose();
	}

}
