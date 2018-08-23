package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Reverse;

class ReverseTest {

	@Test
	void testReverse() {
		assertEquals("Success", Reverse.checkreverse("hi hello"));
		assertEquals("Success", Reverse.checkreverse("ih olleh"));
	}

}
