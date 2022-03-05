package com.practice;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321;
		int temp=num;
		int rev=0;
		
		while (num>0) {
			int n=num%10;
			rev=(rev*10)+n;
			num/=10;
			
		}
		if (rev==temp) {
			System.out.println("12321 is a palindrome number");
		}
		else {
			System.out.println("12321 is not a palindrome number");
		}
			
	}

}
