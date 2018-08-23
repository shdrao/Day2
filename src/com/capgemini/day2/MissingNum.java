package com.capgemini.day2;

public class MissingNum {

	public static int checkMissingnum(int[] array) {
		// TODO Auto-generated method stub
		
		int n=array.length;
		for (int i = 0; i < n - 1; i++) {
			// Last i elements are already in place
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		int num = array[n - 1];

		for (int i = 0; i <= num + 1; i++) { // i= 0 1 2 3 4
			Boolean out = true;
			for (int j = 0; j < n; j++) {
				if (array[j] == i) {
					out = false;
					break;
				}
			}
			if (out == true) {
				return i;
			}
		}
		return 0;

	}

}
