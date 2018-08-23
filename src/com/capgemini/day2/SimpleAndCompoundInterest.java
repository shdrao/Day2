package com.capgemini.day2;

public class SimpleAndCompoundInterest {

	public static double[] calculateInterests(int principle, double rate, int time) {
		// TODO Auto-generated method stub

		double simpleinterest = principle * rate * time / 100;
		double x = 1 + (rate / 100);
	
		double compoundinterest = Math.pow(x, time);
		System.out.println(Math.pow(x, time));
		compoundinterest *= principle;
		System.out.println("Simple Interest=" + simpleinterest + "Compound Interest=" + compoundinterest);
		return new double[] { simpleinterest, compoundinterest };
	}

}
