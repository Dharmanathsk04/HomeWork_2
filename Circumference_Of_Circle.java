package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Circumference_Of_Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius  : ");
		
		double radius = sc.nextDouble();
		
		System.out.println("The radius  is : "+radius);
		
		
		double CircumferenceOfCircle1 = 2*Math.PI*radius;
		
		System.out.println("The Area of Circumference of Circle using function  is : "+CircumferenceOfCircle1);
		
		double CircumferenceOfCircle2 = 2 * 3.1415 * radius;
		System.out.println("The Are of Circumference of Circle without function : "+CircumferenceOfCircle2);
		
		
		
		
		
	}
}
