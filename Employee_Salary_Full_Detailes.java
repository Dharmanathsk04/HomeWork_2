package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Employee_Salary_Full_Detailes {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Enter name : ");
		String name = sc.next();
		
		System.out.println("Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter city : ");
		String city = sc.next();
		
		System.out.println("Enter post : ");
		String post = sc.next();
		
		System.out.println("Enter Basic Salary : ");
		double basicSalary = sc.nextDouble();
		
		
		double darnessAllowance = (basicSalary * 10) / 100;
		double houserentAlowance = (basicSalary * 15) / 100;
		double travelAllowance = (basicSalary *5) / 100;
		double professionalTax = (basicSalary *10) / 100;
		double providentFund = (basicSalary * 12) / 100;
		
		double grossSalary = basicSalary + darnessAllowance + houserentAlowance + travelAllowance;
		
		double netsalary = grossSalary - (professionalTax + providentFund);
		
		
		System.out.println("\n-------Employee Detail-------s");
		
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Post : "+post);
		System.out.println("Basic salary : "+basicSalary);
		System.out.println("darness Allowance : "+darnessAllowance);
		System.out.println("house Rent Alowance : "+houserentAlowance);
		System.out.println("travel Allowance : "+travelAllowance);
		System.out.println("professional Tax :"+professionalTax);
		System.out.println("provident Fund :"+providentFund);
		System.out.println("gross Salary :"+grossSalary);
		System.out.println("net salary : "+netsalary);
		
		sc.close();
	}
}
