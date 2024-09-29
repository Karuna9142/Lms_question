package com.day9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		//created a TreeMap
		TreeMap<String,Integer> mp = new TreeMap<>();
		
		//Intialize with value
		mp.put("One",1);
		mp.put("Three",3);
		mp.put("Two",2);
		
		
		//Original value
		System.out.println(mp);
		
		//remove
		System.out.println(mp.remove("Two"));
		
		//check if the entry with key "three" exist or not.
		boolean isEntryRemoved = mp.containsKey("Three");
		System.out.println("Is the entry 3 removed? " +isEntryRemoved);
		
		//updated tree map
		System.out.println("Updated tree map is:- "+mp);
		
		//Get an iterator for the entrySet of the TreeMap
		Iterator<Map.Entry<String, Integer>> itr = mp.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Integer>ent = itr.next();
			System.out.println("Key:- "+ent.getKey()+ " Value:- " +ent.getValue());
		}

	}

}
