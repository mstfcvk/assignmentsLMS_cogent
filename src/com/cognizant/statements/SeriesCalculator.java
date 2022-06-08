package com.cognizant.statements;

public class SeriesCalculator {
	
	double calculateSum(int n) {
		int returnNum=0;
		if(n == 0) {
			return returnNum;
		}else if(n>0) {
			returnNum=0;
			for(int i=0; i<=n; i++) {
				if(i%2!=0) {
					returnNum+=i;
				}
				
			}
		}else if(n<0) {
			returnNum=0;
			for(int i=0; i>=n; i--) {
				if(i%2!=0) {
					returnNum= returnNum-1;
				}
			}
		}
		return returnNum;
	}
	
	public static void main(String[] args) {
		SeriesCalculator sc = new SeriesCalculator();
		System.out.println(sc.calculateSum(5));
		System.out.println(sc.calculateSum(0));
		System.out.println(sc.calculateSum(-5));
		System.out.println(sc.calculateSum(-3));
		System.out.println(sc.calculateSum(5));
	}

}
