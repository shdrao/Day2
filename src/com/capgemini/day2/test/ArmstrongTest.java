package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Armstrong;

class ArmstrongTest {

	@Test
	void testcheckArmstrongNumber() {
	assertEquals(true, Armstrong.checkArmstrongNumber(153));	
	assertEquals(false, Armstrong.checkArmstrongNumber(-22));
	assertEquals(true, Armstrong.checkArmstrongNumber(0));
	}

}
