package com.practice;

public class Swapwo3rdvariable {

	public static void main(String[] args) {
		String a = "SANJU";
		String b = "SURAJ";
		System.out.println("String before SWAP a=" + a + " and b=" + b);
		
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("String after SWAP a=" + a + " and b=" + b);

	}

}
