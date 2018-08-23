package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.ArrayAndTest;

class ArrayAndKTest {

	@Test
	void testArrayAndK() {
		assertEquals("Success", ArrayAndTest.checkArrayAndK(5));
		assertEquals("Fail", ArrayAndTest.checkArrayAndK(2));
	}

}
