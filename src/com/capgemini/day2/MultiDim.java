package com.capgemini.day2;

public class MultiDim {

	public static String checkmultiDim(int key, int[][] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (key == array[i][j]) {

					System.out.println("found");
					return "Found";
				}

		return "Not Found";

	}

}
