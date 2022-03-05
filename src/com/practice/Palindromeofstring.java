package com.practice;

public class Palindromeofstring {

	public static void main(String[] args) {
		
		String s="malayalam";
		String rev="";
		
		for (int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		if (s.equals(rev)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Is not a palindrome");
		}
	}

}
