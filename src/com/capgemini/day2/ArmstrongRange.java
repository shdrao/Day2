package com.capgemini.day2;

public class ArmstrongRange {

	public static int[] checkArmstrongRangeTest(int start, int end) {
		int a[] = new int[4];
		int newindex = 0;
		// TODO Auto-generated method stub
		for (int index = start; index < end; index++) {
			int number = index;

			int remainder, sum = 0;
			while (number > 0) {
				remainder = number % 10;
				sum = sum + (remainder * remainder * remainder);
				number = number / 10;
			}
			if (sum == index) {
				a[newindex++] = index;

			}

		}
		return a;

	}
}
