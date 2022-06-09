package com.cognizant.statements;

public class Tester_q8 {

	// even method
	public boolean isEven(int x) {
		return (x%2==0)?true:false;
		}
			
	public static void main(String[] args) {
		
		// 
		//System.out.println(isEven(2)); // cte cant access non-static method in static context
		
		
		
		System.out.println(new Tester_q8().isEven(2)); // true
		System.out.println(new Tester_q8().isEven(3)); // false
		System.out.println(new Tester_q8().isEven(4));  // true
		
		String entries[]= {"entry1", "entry2"};
		
		int count =0;
		
		
		while(entries[count++]!=null) { //count 0, count 2 java.lang.ArrayIndexOutOfBoundsException
			System.out.println(count);  // count1 , skipp secondone
		}
		
		System.out.println(count);  // count 2
	}
}
