package com.day3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HillStation h1 = new Manali();
		HillStation h2 = new Gulmarg();
		HillStation h3 = new Masoori();

		System.out.println("Manali.....");
		h1.location();
		h1.famousFor();
		
		System.out.println("Gulmarg....");
		h2.location();
		h2.famousFor();
		
		System.out.println("Masoori....");
		h3.location();
		h3.famousFor();
	}

}
