package com.capgemini.day2;

public class Removeduplicate {

	public static String checkduplicate(String originalstring) {
		// TODO Auto-generated method stub


		String newString = "";
		for(int i=0; i<originalstring.length(); i++) {
			Boolean found = false;
			for(int j=0; j<newString.length(); j++) {
				if(originalstring.charAt(i) == newString.charAt(j)) {
					found = true;
					break;
				}
			}
			if(found == false) {
				newString = newString + String.valueOf(originalstring.charAt(i));
			}
		}
		
		return newString;
	}

}
