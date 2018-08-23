package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Square;

class SquareTest {

	@Test
	void testSquare() {
		assertEquals(25, Square.calculateSquare(5));
		assertEquals(9, Square.calculateSquare(3));
	}

}
