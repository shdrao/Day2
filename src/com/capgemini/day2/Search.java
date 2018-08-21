package com.capgemini.day2;

public class Search {

	public static boolean checkSearch(int key, int[] array) {

		int counter = 0;
		for (int i = 0; i < array.length; i++)

		{
			if (array[i] == key) {

				return true;
			} else
				counter++;
		}

		if (counter == array.length) {

			return false;
		}

		return false;
	}

}
