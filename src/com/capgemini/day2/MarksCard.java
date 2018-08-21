package com.capgemini.day2;

public class MarksCard {

	public static int checkMarksCard(int[] marks) {
		// TODO Auto-generated method stub

		int total = 0;
		int index;
		int average;
		for (index = 0; index < marks.length; index++)
			total += marks[index];
		average = total / marks.length;
		return average;

	}

}
