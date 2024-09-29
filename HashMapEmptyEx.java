package com.day8;
import java.util.HashMap;

public class HashMapEmptyEx {
	public static void main(String[] args) {
		
	 //create an empty hashmap
	 HashMap<Integer,String>h1 = new HashMap<>();
	 //Adding some key value pairs 
	 h1.put(1, "Apple");
	 h1.put(2, "Orange");
	 h1.put(3, "Banana");
	 h1.put(4, "Papaya");
	 h1.put(5, "Kiwi");
	 h1.put(6, "PineApple");
	 
	 System.out.println(h1);
	//checking hashmap is empty or not
	 
	 if(h1.isEmpty())
	 {
		 System.out.println("HashMap is Empty");
	 }
	 else
	 {
		 System.out.println("Hashmap contains key value mapping");
	 }
	}

}
