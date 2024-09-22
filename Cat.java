package com.day3;

public class Cat extends Animal
{
	public void makeSound()
	  {
		  System.out.println("The Cat meows..." );
	  }
	public static void main(String[]args)
	{
		Animal a1 = new Animal();
		Dog d1  = new Dog();
		Cat c1 = new Cat();
		
		a1.makeSound();
		d1.makeSound();
		c1.makeSound();
	}
}
