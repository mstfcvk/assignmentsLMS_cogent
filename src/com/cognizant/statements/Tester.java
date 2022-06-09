package com.cognizant.statements;


public class Tester {
	public static void main(String[] args) {
		int x=0, y =0;
		
		
		if((true & false) | (true & false) & x++>0 ) 
			System.out.println("s1"); // not gonna prin result is false
		
		if(false|| true | (++y > 0 | y++>0)) 
			System.out.println("s2"); // s2
		System.out.println(x+" "+y);
		
		
		
		// second problem
		
		x = 1;
		y =0;
		
		if((y==x++) && x<++y) {  // x = 2 still, y =0  bc 2nd statement will pass
			
		}
		System.out.println(x+""+y); //11
		}
	
	
	

}
