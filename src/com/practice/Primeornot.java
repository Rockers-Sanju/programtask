package com.practice;

public class Primeornot {

	public static void main(String[] args) {
		int a = 14;
		int count = 0;

		// 1 				2      5
		for (int i = 2; i <= a/2; i++) {
			if (a % i == 0) { //3
				count++; //4

			}
		}
		if (count == 0) {
			System.out.println(a + " Is a prime number");
		} else {
			System.out.println("Is not a prime number");
		}
		System.out.println(13%6);
	}
}
/*
 *  *  PRIME NUMBER CASE

 * 1            2               3                        4          5
 * 
 * i=2			2<=13/2=6.5		13%2=1 ==0 cond.failed     -     i=2+1=3
 * i=3			3<=13/2=6.5 	13%3=1 ==0 cond.failed
 * i=4			4<=13/2=6.5 	13%4=1 ==0 cond.failed
 * i=5			5<=13/2=6.5 	13%5=3 ==0 cond.failed
 * 
 * i=6			6<=13/2=6.5 	13%6=1 ==0 cond.failed
 * i=7			7<=13/2=6.5 	loop terminated

 * 
 * NOT A PRIME NUMBER CASE
 * 
 * 
 * 1            2               3                        4          5
 * 
 * i=2			2<=14/2=7		14%2=1 ==0 cond.failed     -     i=2+1=3
 * i=3			3<=14/2=7   	14%3=1 ==0 cond.failed
 * i=4			4<=14/2=7    	14%4=1 ==0 cond.failed
 * i=5			5<=14/2=7   	14%5=3 ==0 cond.failed
 * 
 * i=6			6<=14/2=7   	14%6=1 ==0 cond.failed
 * i=7			7<=14/2=7   	14%7=0 ==0 COND. PASSED  COUNT=0+1=1
 * 
 * 
 * GOES TO IF CASE 
 * .. NOT SATISFIED AND PRINT NOT A PRIME NUMBER
 * 
 * 
 * 
 * 
 * 
 * 
 */
