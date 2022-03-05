package com.practice;

public class Armstrng {

	public static void main(String[] args) {

 int num=154;
 int temp=num;
 int arm=0;
 
 while (num>0) {
	 int n=num%10;
	 arm=arm+(n*n*n);
	 num/=10;
 }
if (arm==temp) {
	System.out.println("Is a armstrong number");
}
else {
	System.out.println("Is not a armstrong number");
}

	}

}
