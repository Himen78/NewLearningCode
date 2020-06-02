package com.java.corejavaprograms;

import java.io.Reader;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		
		//nextDouble() reads the next double from keyboard
		
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		
		System.out.println("Enter an Operator (+, -, *, /)");
		char operator = scanner.next().charAt(0);
		
		double result;
		
		switch (operator)
		{
		
		case '+':
			result = first + second;
		    break;
		    
		case '-':
			result = first - second;
			break;
			
		case '*':
			result = first * second;
			break;
			
		case '/':
			result = first / second;
		    break;
		    
		    default:
		    
		    System.out.println("Error! opeartor is not correct");
		    return;
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
		
	}

}
