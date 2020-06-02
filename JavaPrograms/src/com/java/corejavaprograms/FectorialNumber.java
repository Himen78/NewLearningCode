package com.java.corejavaprograms;

import java.util.Scanner;

public class FectorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num = scanner.nextInt();
		int factorial = fact(num); // Store the factorial number
		System.out.println("Factorial of entered number is:"+factorial);
	}
	
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
		}
		// Recursion : Function calling itself!!
		
		output = fact(n-1)* n; // fact(4)*5 = 4*3*2*1*5 = 120
		return output;
		
	}
	

}
