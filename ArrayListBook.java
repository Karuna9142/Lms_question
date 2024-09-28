package com.day6_collection;

import java.util.ArrayList;
import java.util.Iterator;
class Book {

//	 Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object.
//	 Create an ArrayList of type Book and store all book objects into collections and display all book details.
//	 [Hint:Use advanced for loop to display all Books details]
	
	// data member
	  int bookId;
	  String bookName;
	  String authorName;
	
	//parameterized Constructor to initialize the object
	Book(int bookId, String bookName, String authorName)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	//method to display book details
	public void display()
	{
		System.out.println("Book id:- "+bookId);
		System.out.println("Book name:- "+bookName);
		System.out.println("Author name:- "+authorName);
	}
}

public class ArrayListBook {

	public static void main(String[] args) {
		// Create an ArrayList to store Book Objects
		ArrayList<Book> b1 = new ArrayList<Book>();
		
		//Adding book object to the list
		b1.add(new Book(101, "java","James Gosling"));
		b1.add(new Book(102, "Python","Guido van Rossum"));
		b1.add(new Book(101, "C++","Bjarne Stroustrup"));
		
		//creating an iterator to iterate through arraylist
		Iterator<Book> itr = b1.iterator();
		
		//displaying book details using the iterator
		while(itr.hasNext())
		{
			Book b2 = itr.next();
			b2.display();
		}
	}

}
