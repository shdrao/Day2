package com.capgemini.day2;

public class ArrayAndTest {

	public static String checkArrayAndK(int key) {
		// TODO Auto-generated method stub
		int[] array = { 10, 80, 30, 60, 10, 40 };
		int k = 0;
		int position1 = 0, position2 = 0;
		Boolean found = false;
		while (k != array.length) {
			for (int i = k + 1; i < array.length; i++) {
				if (array[k] == array[i]) {
					position1 = k;
					position2 = i;
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
			k++;
		}
		if (Math.abs(position1 - position2) < key) {
			return "Success";
		} else {
			return "Fail";
		}

	}
}
