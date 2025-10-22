package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

class Employee {
	
	String name;
	int age;
	String city;
	String post;
	double basicSalary;
}
public class Employee_Detales {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Enter Employee Name : ");
		emp.name = sc.nextLine();
		
		
		System.out.println("Enter Employee Age : ");
		emp.age = sc.nextInt();
		
		
		System.out.println("Enter Employee city : ");
		emp.city = sc.next();
		
		
		System.out.println("Enter Employee post : ");
		emp.post = sc.next();
	
		
		System.out.println("Enter Employee Basic Salary : ");
		emp.basicSalary = sc.nextDouble();

		
		
		System.out.println("\n-------Employee Detales----------");
		System.out.println("Name : "+emp.name);
		System.out.println("Age : "+emp.age);
		System.out.println("City : "+emp.city);
		System.out.println("Post : "+emp.post);
		System.out.println("basic salary : "+emp.basicSalary);
		
		sc.close();
		
	}
	
}
