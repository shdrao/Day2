package com.capgemini.day2;

public class BillGeneration {

	public static float displayBill(int newItem) {
		// TODO Auto-generated method stub
		float discount = (float) 0.35 * newItem;
		float newItemPrice = newItem - discount;
		return newItemPrice;
	}

}
