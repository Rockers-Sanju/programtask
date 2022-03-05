package com.practice;

public class Sumofdigits {

	public static void main(String[] args) {
		int num=12345678;
		int sum=0;
		
		while (num!=0) {
			int n=num%10;
			sum=sum+n;
			num/=10;
		
		}
		System.out.println("The sum of digits is " + sum);

	}

}


