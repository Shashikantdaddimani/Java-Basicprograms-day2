package com.javabasics.day2;

import java.util.Scanner;

public class ForLoopReverseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt(); 
		int reverse = 0;  
		  
//		for( ;number != 0; number=number/10)   
		for(int i = number; i >0;)
		{  
		int remainder = i % 10;  
		reverse = reverse * 10 + remainder;  
		i=i/10;
		}  
		System.out.println("The reverse of the given number is: " + reverse); 
	}

}
