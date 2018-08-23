package com.capgemini.day2;

public class Square {

	public static int calculateSquare(int number) {
		// TODO Auto-generated method stub
		int square = number * number;

		for (int index = 1; index < 11; index++)
			System.out.println(number + "X" + index + "=" + number * index);

		return square;
	}

}
