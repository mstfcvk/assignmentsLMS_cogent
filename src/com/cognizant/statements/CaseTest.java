package com.cognizant.statements;

// problem7
public class CaseTest {
	public static void main(String[] args) {
		char c ='a';
		
		/*
		 * switch(c) { case 'a':{ System.out.println("a"); // this get printed break; }
		 * case 97: { // CTE cause duplicate case System.out.println("97"); break; } }
		 */
		
		
		int x = 0;
		int y =0;
		for(int z=0; z<5; z++) {
			if((++x>2 ) && (++y>2))  // x=1 y=0 f0rnfirst one
			{						// skip y, and skip x
				x++;             // this will read only once 
			}
		}
		System.out.println(x+" "+y);  // 6 3
	}

}
