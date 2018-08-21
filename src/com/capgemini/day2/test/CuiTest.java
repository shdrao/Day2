package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Cui;

class CuiTest {

	@Test
	void testCuiTest() {
		assertEquals("Fail", Cui.checkCuiTest("pass","user"));
		assertEquals("Success", Cui.checkCuiTest("user","pass"));
	}

}
