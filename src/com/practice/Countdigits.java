package com.practice;

public class Countdigits {
	
	// count number of digits

	public static void main(String[] args) {
		
		int num=12345678;
		int count=0;
		while (num>0) {
			count++;
			num/=10;
			
		}
System.out.println("The total count is "+ count);
	}

}
