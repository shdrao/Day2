package com.capgemini.day2;

public class NameSearch {

	public static int checkname(String key, String[] words) {
		// TODO Auto-generated method stub

		int c = 0;
		for (int i = 0; i < 4; i++) {
			if (key.equals(words[i]))
				c++;
		}
		if (c == 0)
			//System.out.println("Not found");
			return 0;
		else
			return c;
	}

}
