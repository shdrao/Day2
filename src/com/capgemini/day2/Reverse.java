package com.capgemini.day2;

public class Reverse {

	public static String checkreverse(String originalstring) {
		// TODO Auto-generated method stub

		String[] splitstring = originalstring.split(" ");

		for (int i = 0; i < splitstring.length; i++) {
			StringBuilder a = new StringBuilder();

			a.append(splitstring[i]);

			a = a.reverse();

			System.out.print(a + " ");

		}
		return "Success";
	}

}
