package com.tka1_16_Oct2025_Problem_Set;

import java.util.Scanner;

public class To_Cheak_Vowels {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the Vowel : ");
		Scanner sc = new Scanner(System.in);
		
		String v = sc.next();
		
		switch(v) {
		
		case"a":
			System.out.println("it is a lowercase vowel");
			break;
			
		case "A":
		System.out.println("it is a Uppercase vowel");
		break;
		
		case "e":
			System.out.println("it is a lowercase vowel");
			break;
			
		case "E":
			System.out.println("it is a uppercase vowel");
			break;
			
		case"i":
			System.out.println("it is a lowercase vowel");
			break;
			
		case"I":
			System.out.println("it is a uppercase vowel");
			break;
			
		case "o":
			System.out.println("it is a lowercase vowel");
			break;
			
		case "O":
			System.out.println("it is a uppercase vowel");
			break;
			
		case "u":
			System.out.println("it is a lowercase vowel");
			break;
			
		case "U":
			System.out.println("it is a uppercase vowel");
			break;
			
			default:
				System.out.println("Invalid Choice");
			
		}
		
		sc.close();
		
	}
}
