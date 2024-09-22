package com.karuna;
import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:-");
    
    String str = sc.nextLine();
    
    
    for(int i = 0; i<str.length(); i++)
    {
    	int count = 0;
    	for(int j = 0; j<str.length(); j++)
    	{
    		if(str.charAt(i)==str.charAt(j)&& i!=j)
    		{
    			count = 1;
    			break;
    		}
    	}
    	if(count==0)
    	{
    		System.out.print(str.charAt(i));
    	}
    }
    
	

	}
}
