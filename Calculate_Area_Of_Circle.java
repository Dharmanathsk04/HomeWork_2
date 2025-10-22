package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Calculate_Area_Of_Circle {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		
		System.out.println("The area is : ");
		
		
		double AreaOfCircle = 3.14159265359 * area * area;
		
		// or use math.PI library//
		
		double AreaOfCircle1 = Math.PI * area * area;
		
		System.out.println("Area of Circle without function  is : "+AreaOfCircle);
		
		System.out.println("Area of circle using function : "+AreaOfCircle1);
		
		sc.close();
		
	}
}
