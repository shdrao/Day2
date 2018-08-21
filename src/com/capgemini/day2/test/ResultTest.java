package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import com.capgemini.day2.Result;

class ResultTest {

	@Test
	void testMarksCars() {
		assertEquals("Passed", Result.checkResult(90,80,70));
		assertEquals("Promoted", Result.checkResult(90,80,30));
		assertEquals("Failed", Result.checkResult(30,10,20));
	}

}
