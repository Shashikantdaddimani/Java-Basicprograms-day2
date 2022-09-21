package com.javabasics.day2;

import java.util.Scanner;

public class ForLoopSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt(); 
				int sum = 0;
				
		System.out.print("First " + n + " Numbers = ");
		for (int i=1;i<=n;i++) {
			sum=sum+i;
			
			System.out.print(i + " + ");

	}
		System.out.println();
	System.out.println("Sum of natural numbers using while loop is:"+" "+sum);

}
}