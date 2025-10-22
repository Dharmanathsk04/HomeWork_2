package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class Country_And_Capital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Country Name : ");
		String country = sc.next();
		
		switch(country.toLowerCase()) {
		
		case "india":
			System.out.println("Capital : new Delhi");
			break;
			
		case "usa":
			System.out.println("Capital : Washington D.C");
			break;
			
		case "japan":
			System.out.println("Capital : Tokyo");
			break;
			
		case "Spain":
			System.out.println("Capital: Madrid");
			break;
			
		case "france":
			System.out.println("Capital : Paris");
			break;
			
		case "germany":
			System.out.println("Capital : Berlin ");
			break;
			
		case "italy":
			System.out.println("Capital : Rome");
			break;
			
		case "Denmark":
			System.out.println("Capital : Moscow");
			break;
			
		case"canada":
			System.out.println("Capital : Copenhagen");
			break;
			
		case "australia":
			System.out.println("Capital: Canberra ");
			break;
			
			default:
				System.out.println("Country not found");
			
		}
		sc.close();
	}
}
