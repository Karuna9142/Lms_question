package com.day3;

public class HillStation 
{
	/*
	Create one superclass HillStations and three subclasses Manali,
	Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() 
	and famousFor() method. i.call the location() and famousFor() method by the Parent class’,
	i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method;
	the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and 
	print accordingly.
	*/
	
	public void location()
	{
		System.out.println("One of the famous Hill area");
	}
	public void famousFor()
	{
		System.out.println("famous for hill area");
	}
}
