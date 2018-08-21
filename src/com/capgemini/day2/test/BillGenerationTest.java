package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.BillGeneration;

class BillGenerationTest {

	@Test
	void testBillGeneration() {
		assertEquals(65, BillGeneration.displayBill(100));
		assertEquals(29.25, BillGeneration.displayBill(45));
	}

}
