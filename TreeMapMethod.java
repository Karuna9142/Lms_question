package com.day9;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethod {

	public static void main(String[] args) {
		
		//Creating a tree amp of Integer and String
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(1, "Lion");
		tmap.put(2, "Tiger");
		tmap.put(3, "Goat");
		tmap.put(4, "Monkey");
		tmap.put(5, "Elephant");
		tmap.put(6, "Camel");
		
		System.out.println(tmap);
		
		//get
		System.out.println(tmap.get(2));
		
		//pollFirstEntry
		System.out.println(tmap.pollFirstEntry());
		//pollLastEntry
		System.out.println(tmap.pollLastEntry());
		
		//Retrieving Value
		String value = tmap.get(2);
		System.out.println("Retriving value:- "+value);
		
		//Removing an entry
		tmap.remove(1);
		System.out.println("Tree map after removing value:- "+tmap);
		
		//firstKey method()
		Integer firstKey = tmap.firstKey();
		//LastKey method()
		Integer LastKey = tmap.lastKey();
		
		System.out.println("First Key:- "+firstKey);
		System.out.println("Last Key:- "+LastKey);
		
		//using higherKey
		Integer higherKey = tmap.higherKey(1);
		//using lowerKey
		Integer lowerKey = tmap.lowerKey(3);
		
		//get entries around a given key
		Integer ceillingKey = tmap.ceilingKey(2);
		Integer floorKey = tmap.floorKey(4);
		
		System.out.println("Higher Key:- "+higherKey);
		System.out.println("Lower Key:- "+lowerKey);
		
		System.out.println("Ceilling Key:- "+ceillingKey);
		System.out.println("Floor Key:- "+floorKey);
		
		//Iterating through keySet
		for(Integer key:tmap.keySet())
		{
			System.out.println("Integer Value:- "+key);
		}
		
		//Iterating through Value
		for(String val:tmap.values())
		{
			System.out.println("String Value:- "+val);
		}
		//Iterating through entrySet
		System.out.println("Key-Value Pairs:- ");
		for(Map.Entry<Integer, String> en:tmap.entrySet())
		{
			System.out.println("Key:- "+en.getKey()+ " Value:- "+en.getValue());
		}
		
		//Using an Iterator over keySet
		Iterator<Integer> itr = tmap.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println("Key:- "+key+ " Value:- "+tmap.get(key));
		}
		
		
		
		
		
		
	}

}
