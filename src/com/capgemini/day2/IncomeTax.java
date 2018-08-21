package com.capgemini.day2;

public class IncomeTax {

	public static String checkincomeTax(int salary) {

		if (salary < 180000)
			return "Nil";
		else if (salary < 300000) {
			System.out.println("Tax=" + 0.1 * salary);
			return "Pay Tax";}
		else if (salary < 500000) {
			System.out.println("Tax=" + 0.2 * salary);
			return "Pay Tax";}
		else
			{System.out.println("Tax=" + 0.3 * salary);
		return "Pay Tax";}
	}

}
