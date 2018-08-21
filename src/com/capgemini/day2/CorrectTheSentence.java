package com.capgemini.day2;

public class CorrectTheSentence {

	public static String checksentence(int position, String sentence) {

		String[] newsentence = sentence.split("\\s+");
		for (int index = 0; index < newsentence.length; index++) {
			if (index == position - 1) {
				continue;
			}

			System.out.print(newsentence[index] + " ");

		}
		return "Success";
	}
}