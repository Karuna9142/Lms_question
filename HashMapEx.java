package com.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Created a HashMap of Integer and String
		HashMap<Integer,String>h1 = new HashMap<>();
		
		//Assign key value pair to the hashMap.
		h1.put(101,"Karuna");
		h1.put(102,"Kriti");
		h1.put(103,"Kritika");
		h1.put(104,"Seema");
		h1.put(105,"Meena");
		h1.put(106,"Geeta");
		
		//Original value
		System.out.println(h1);
		
		//Use entrySet() to iterate through the HashMap
		System.out.println(h1.entrySet());
		
		//display Integer value
		for(Integer i:h1.keySet())
		{
			System.out.println("Integer Value:- "+i);
		}
		//display String value
		for(String s :h1.values())
		{
			System.out.println("String Value:- "+s);
		}
        // Getting the entrySet which returns key value
		Set<Map.Entry<Integer, String>>s = h1.entrySet();
		
		// Iterating over the entry set
		for(Map.Entry<Integer, String>itr: s)
		{
			//printing the key value
			System.out.println(itr.getKey()+ " "+itr.getValue());
		}
	}

}
