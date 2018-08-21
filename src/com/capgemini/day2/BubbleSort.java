package com.capgemini.day2;

public class BubbleSort {

	public static int[] arrangeBubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int size = 15;
		int temp = 0;
		for (int index = 0; index <= size; index++) {
			for (int cursor = 1; cursor < (size - index); cursor++) {
				if (arr[cursor - 1] > arr[cursor]) {
					temp = arr[cursor - 1];
					arr[cursor - 1] = arr[cursor];
					arr[cursor] = temp;
				}
			}
		}
		for (int index = 0; index < size; index++)
			System.out.print(arr[index] + "\t");
		return arr;

	}
}
