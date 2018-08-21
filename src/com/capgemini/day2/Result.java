package com.capgemini.day2;

public class Result {

	public static String checkResult(int sub1, int sub2, int sub3) {
		// TODO Auto-generated method stub

		if (sub1 > 60 && sub2 > 60 && sub3 > 60)
			return "Passed";
		else if ((sub1 > 60 && sub2 > 60) || (sub2 > 60 && sub3 > 60) || (sub3 > 60 && sub1 > 60))
			return "Promoted";
		else
			return "Failed";

	}

}
