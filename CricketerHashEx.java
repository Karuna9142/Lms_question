package com.day8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketerHashEx {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Create a Map to store cricketer names and their scores
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		//Add cricketers and their scores to the Ma
		m1.put("Virat Kohli", 120);
        m1.put("Sachin Tendulkar", 150);
        m1.put("MS Dhoni", 100);
        m1.put("Rohit Sharma", 140);
        m1.put("AB de Villiers", 130);
        
        System.out.println(m1);
        
        //create a Scanner class
        System.out.println("Enter the name of the cricketer:- ");
        String cricketName = sc.nextLine();
        
        //// Search for the cricketer in the Map and display the scor
        if(m1.containsKey(cricketName))
        {
        	System.out.println("Cricketer Name:- "+cricketName+ " Score:- "+m1.get(cricketName));
        }
        else
        {
        	System.out.println("Cricketer name not found");
        }
        
        

	}

}
