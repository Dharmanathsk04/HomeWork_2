package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Area_Of_Rectangle {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Lenth : ");
		
		double Lenth = sc.nextDouble();
		
		System.out.println("The lenth is : "+Lenth);
		
		System.out.println("Enter The Width : ");
		
		double Breadth = sc.nextDouble();
		
		System.out.println("The Width is : "+Breadth);
		
		double AraeOfRectangle = Lenth * Breadth;
		System.out.println("The Are Of Rectangle is : "+AraeOfRectangle);
	}
}
