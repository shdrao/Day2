package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void testDate() {
		assertEquals("21/March/1996", Date.checkDate("21,03,1996"));
		assertEquals("Wrong", Date.checkDate("00,00,0000"));
		assertEquals("11/May/1947", Date.checkDate("11,05,1947"));
	}

}
