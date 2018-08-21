package com.capgemini.day2;

public class Armstrong {

	public static boolean checkArmstrongNumber(int i) {
		// TODO Auto-generated method stub
		int sum = 0, digit, number = i;
		while (i > 0) {
			digit = i % 10;
			sum = sum + (digit * digit * digit);
			i = i / 10;
		}
		if (number == sum)
			return true;
		else
			return false;
	}

}
