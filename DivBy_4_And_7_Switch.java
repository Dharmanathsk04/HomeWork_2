package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class DivBy_4_And_7_Switch {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
		

		default:
			
			if(num%4==0 && num%7==0) {
				System.out.println("Divisible by 4 and 7");
				break;
			}
			
			else if(num%4==0) {
				System.out.println("Divisible by 4");
				break;
			}
			
			else if(num%7==0) {
				System.out.println("Divisible by 7");
				break;
			}
			
			else {
				
				System.out.println("not divisible by 4 and 7");
			}
		
		}
		
		sc.close();
	}
}
