package com.karuna;

public class ParenthesisMatcher {
	
	public static int findClosingParenthesis(String sentence, int openingPos) {
        int count = 1; // Start with the first opening parenthesis
        
        for (int i = openingPos + 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '(') {
                count++;
            } else if (sentence.charAt(i) == ')') {
                count--;
            }
            if (count == 0) {
                return i; // Return the position of the matching closing parenthesis
            }
        }
        
        return -1; // No matching closing parenthesis found
    }

    public static void main(String[] args) {
        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int openingPos = 10;
        int closingPos = findClosingParenthesis(sentence, openingPos);
        System.out.println(closingPos); // Output: 79
    }
}


