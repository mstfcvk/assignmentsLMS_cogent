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
		
		
		System.out.println("\n\n");
		
		// 3rd prblem
		x=0;
		y=0;
		
		if((y == x++) | (x<++y)) {// 1st stmnt is wrong so 2nd stmnt will executed too
			++y;                   // if stmnt is false so we skip this line
		}
		System.out.println(x+""+y);  // x = 1, y=1 ->11
		
		// problem: 4
		do {
			System.out.println("inside do"); // this will execute once no matter w
		}while(false);		// while condition
		System.out.println("inside while"); // will print since not related to do/while
		
		
		System.out.println("outside"); // will print since not related to do/while
		
		
		System.out.println("\n\n  Problem 5 \n");
		
		int j= 10;
		
		switch(1) {  // incase where is 1
		case 20: j+=1; 
		case 40: j+=2;
		default: j+=3; // j =13
		case 0: j+=4;  // since no break j=17
		}
		System.out.println(j); // j=17 
		
		}
	
	
		
	
	
	
	
	

}
