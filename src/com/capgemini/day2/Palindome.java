package com.capgemini.day2;

public class Palindome {

	public static String checkPalindrome(int number) {
		// TODO Auto-generated method stub
		if (number < 0)
			System.out.println("False");

		else {
			int c = number;

			int rem, rev = 0;
			while (number > 0) {
				rem = number % 10;
				rev = 10 * rev + rem;
				number = number / 10;
			}
			if (rev == c)
				return "Palindrome";
			
				return "Not Palindrome";
		}
return "Not Palindrome";
	}
	
}
