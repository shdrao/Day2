package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.IncomeTax;

class IncomeTaxTest {

	@Test
	void testIncomeTax() {
		assertEquals("Nil", IncomeTax.checkincomeTax(50000));
		assertEquals("Pay Tax", IncomeTax.checkincomeTax(200000));
		assertEquals("Pay Tax", IncomeTax.checkincomeTax(400000));
		assertEquals("Pay Tax", IncomeTax.checkincomeTax(1000000));
	}

}
