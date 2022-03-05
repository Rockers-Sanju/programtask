package com.practice;

public class Revthestring {

	public static void main(String[] args) {
		String s="hello";
		String rev="";
		
// 					1             2		4
		
		for (int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);  //3
		}
System.out.println(rev);
System.out.println(s.length()-1);    //nnn
	}

}

/*		For Loop Index Based =It Strat from  4 index value
  		1			2			3					4
 
	i=5-1=4		4>=0		rev= +o=o			  i=4-1=3
	i=3			3>=0		rev=o+l=ol			  i=3-1=2
	i=2			2>=0		rev=ol+l=oll		  i=2-1=1
	i=1			1>=0		rev=oll+e=olle		  i=1-1=0
	i=0			0>=0		rev=olle+h=olleh	  i=0-1=-1
	i=-1	   -1>=0=================>Condition FAil
			------------------------->Loop Terminated  
*/