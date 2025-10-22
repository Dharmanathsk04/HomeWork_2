package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class AreaCalculator_User_options {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Choose an option : ");
	 System.out.println("1. area of circle");
	 System.out.println("2. area of rectangle");
	 System.out.println("3. area of squre");
	 System.out.println("4. circumference of circle");
	 System.out.println("5. squre of Number : ");
	 System.out.println("6. cube of number : ");
	 
	 System.out.println();
	 
	 System.out.println("Enter your choice : ");
	int choice = sc.nextInt();
	
	switch(choice) {
	
	case 1:
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		double AreaOfCircle = 3.1415 * radius * radius;
		System.out.println("Area of circle without function  : "+AreaOfCircle);
		
		// using math.PI() function
		
		double AreaOfCircle1 = Math.PI * radius * radius;
		System.out.println("Area of circle  using function : "+AreaOfCircle1);
		break;
		
	case 2:
		
		System.out.println("Enter Lenth : ");
		double lenth = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double breadth = sc.nextDouble();
		
		double AreaOfRectangle = lenth * breadth;
		System.out.println("Area of rectangle is : "+AreaOfRectangle);
		break;
		
		
	case 3:
		
		System.out.println("Enter side : ");
		double side = sc.nextDouble();
		
		double areaSide = side * side;
		System.out.println(" area of squre is : "+areaSide);
		break;
		
	case 4:
		System.out.println("Enter radius : ");
		double r = sc.nextDouble();
		
		// using Math.PI() function//
		double radius1 = 2 * Math.PI * r;
		System.out.println("circumference of circle using function  is :  : "+radius1);
		
		double radius2 = 2 * 3.1415 * r;
		System.out.println("circumference of circle without  using function  is"+radius2);
		break;
		
	case 5:
		System.out.println("Enter the number : ");
		double num1 = sc.nextDouble();
		double squre = Math.pow(num1,2);
		System.out.println("squre of Number using function is : "+squre);
		
		double num2 = num1 *num1;
		System.out.println("squre of Number without using function is :"+num2);
		break;
		
	case 6:
		System.out.println("Enter number : ");
		double num3 = sc.nextDouble();
		double cube = Math.pow(num3,3);
		System.out.println("cube of number using function  is : "+cube);
		
		double cube2 = num3 * num3 * num3;
		System.out.println("cube of number without using function  is : "+cube2);
		break;
		
		default:
			
			System.out.println(" Invalid Choice ");
		
	}
	sc.close();
	 
	 
}
}
