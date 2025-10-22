package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Area_Of_Squre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Area : ");
		
		double  squre = sc.nextDouble();
		
		System.out.println("The Area is : "+ squre);
		
		double AreaOfSqure = squre * squre;
		
		
		System.out.println("The are of Sqaure without function  is : "+AreaOfSqure);
		
		// using a math.pow() function//
		
		double AreaOfSqure1 = Math.pow(squre,2);
		System.out.println("The Area of Sqaure using function : "+AreaOfSqure1);
		
		sc.close();
	}
}
