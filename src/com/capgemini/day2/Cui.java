package com.capgemini.day2;

public class Cui {

	public static String checkCuiTest(String usernameip, String passwordip) {
		// TODO Auto-generated method stub
		String usernameset = "user";
		String passwordset = "pass";

		if (usernameip.equals(usernameset) && passwordset.equals(passwordip)) {
			return "Success";

		} else
			return "Fail";

	}

}
