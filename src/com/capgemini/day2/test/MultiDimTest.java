package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MultiDim;

class MultiDimTest {

	@Test
	void testMultiDim() {
		assertEquals("Found", MultiDim.checkmultiDim(5,new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
		assertEquals("Not Found", MultiDim.checkmultiDim(10,new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
	}

}

