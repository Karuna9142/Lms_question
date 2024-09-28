package com.day7;
import java.util.HashSet;

public class HashSetAppendEx {

	public static void main(String[] args) {
		
		//created a HashSet of String
		HashSet<String> hs = new HashSet<>();
		
		//added some value
		hs.add("Priti");
		hs.add("Prachi");
		hs.add("Neha");
		hs.add("Dolly");
		hs.add("Pihu");
		
		//Original list
		System.out.println("Original Set:- "+hs);
		
		//added new element
		hs.add("Kriti");
		
		//updated list
		System.out.println("Updated Set:- " +hs);
		
	
		

	}

}
