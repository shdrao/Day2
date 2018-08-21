package com.capgemini.day2;

public class Date {

	public static String checkDate(String input) {
		// TODO Auto-generated method stub

		String date;
		String month;
		date = input;
		String[] date1 = date.split(",");

		int date2 = Integer.parseInt(date1[0]);
		if (date2 < 1 || date2 > 31)
			return "Wrong";

		switch (date1[1]) {
		case "01":
			month = "January";
			break;
		case "02":
			month = "February";
			break;
		case "03":
			month = "March";
			break;
		case "04":
			month = "April";
			break;
		case "05":
			month = "May";
			break;
		case "06":
			month = "June";
			break;
		case "07":
			month = "July";
			break;
		case "08":
			month = "August";
			break;
		case "09":
			month = "September";
			break;
		case "10":
			month = "October";
			break;
		case "11":
			month = "November";
			break;
		case "12":
			month = "December";
			break;
		default:
			month = "error";
			return "Wrong";
		}

		return (date1[0] + "/" + month + "/" + date1[2]);
	}

}
