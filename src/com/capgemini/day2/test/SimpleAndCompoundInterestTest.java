package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.SimpleAndCompoundInterest;

class SimpleAndCompoundInterestTest {

	@Test
	void test() {
		assertArrayEquals( new double[]{16.0,116.6},SimpleAndCompoundInterest.calculateInterests(100,8,2), 0.6);
		assertArrayEquals( new double[]{1.6,11.6},SimpleAndCompoundInterest.calculateInterests(10,8,2),0.6);
	}

}
