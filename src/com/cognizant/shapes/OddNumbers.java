package com.cognizant.shapes;

//final String my = "alksdn";

public class OddNumbers {
	public static void main(String[] args) {
	
		// problem1
		for(int i=0; i<200; i++) {
			if(i%2 != 0) {
				System.out.print(i+",");
			} 
			
		} // end of foor loop
		
		System.out.println("\n\n");
		
		// problem2
		int n = 6;
		
		for(int i=1; i <= n; i++) {
			int p=1;
			for(int j= 1;j<=i; j++) {
				System.out.print(p++);
			}
			System.out.println();
		}
		n =5;
		for(int i=1; i <= n; i++) {
			int p=1;
			for(int j= 5;j>=i; j--) {
				System.out.print(p++);
			}
			System.out.println();
		}
        
     
	
	}
	
	/*
	 * public static String printARightTriangle(int N) { StringBuilder result = new
	 * StringBuilder(); for (int r = 1; r <= N; r++) { for (int j = 1; j <= r; j++)
	 * { result.append(r); } result.append(System.lineSeparator()); } return
	 * result.toString(); }
	 */

}
