package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MissingNum;

class MissingnumTest {

	@Test
	void testMissingNum() {
		assertEquals(1, MissingNum.checkMissingnum(new int []{0,2,3,4}));
		assertEquals(3, MissingNum.checkMissingnum(new int []{0,2,1,4}));
	}

}
