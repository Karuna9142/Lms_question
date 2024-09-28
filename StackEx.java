package com.day7;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
	
     //create a stack of Integer type to store the element
		Stack<Integer> s1 = new Stack<Integer>();
		
		//pushed 10 element here
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(10);
		s1.push(11);
		s1.push(12);
		s1.push(13);
		
		//Value of Original Stack
		System.out.println("Original Element of stack:- "+s1);
		
	   //Removing element from stack
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
		//After removing Updated value of stack
		System.out.println("After removing element from stack:- "+s1);
	
	}

}
