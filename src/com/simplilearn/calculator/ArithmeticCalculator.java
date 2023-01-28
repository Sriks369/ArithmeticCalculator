package com.simplilearn.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

public static void ArithmeticCalculator(){
		
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Enter the first number");
		  double a = s.nextDouble();
		System.out.println("Enter the second number");
		  double b = s.nextDouble();
		System.out.println("Enter the action to be performed add/subtract/multiply/divide");  
		  String action = s.next();
		  double result=0;
		  if(action.equalsIgnoreCase("add")) {		  
			 result = a+b;
		  }else if(action.equalsIgnoreCase("subtract")) {
			 result = a-b;
		  }else if(action.equalsIgnoreCase("multiply")) {
			 result = a*b;
		  }else if(action.equalsIgnoreCase("divide")) {
			 result = a/b;
			  }	
			System.out.println(result);
		}
		
public static void main(String[] args) {
		
			ArithmeticCalculator();
	}

}
