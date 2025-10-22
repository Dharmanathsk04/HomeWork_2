package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Enter_option_For_Operations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frist Number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number : ");
		double num2 = sc.nextDouble();
		
		System.out.println("\n Chose Operation : ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulas");
		
		int choice = sc.nextInt();
		
		double result = 0;
		
		if(choice == 1) {
			
			result = num1 + num2;
			System.out.println("Addition is : "+result);
		}
		else if(choice == 2) {
			result = num1 - num2;
			System.out.println("Substraction is : "+result);
		}
		
		else if(choice == 3 ) {
			
			result = num1 * num2;
			System.out.println("Multiplication is : "+result);
		}
		
		else if(choice == 4) {
			
			result = num1 / num2;
			System.out.println("Division is : "+result);
		}
		
		else if(choice == 5) {
			
			result = num1 % num2;
			System.out.println("Modulus : "+result);
		}
		
		else {
			System.out.println("Invalid choice");
		}
		
		sc.close();
	}
}
