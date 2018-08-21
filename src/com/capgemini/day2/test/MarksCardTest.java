package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.MarksCard;

class MarksCardTest {

	@Test
	void testMarksCard() {
		assertEquals(30,MarksCard.checkMarksCard(new int[] {30,30,30}));//student1
		assertEquals(40,MarksCard.checkMarksCard(new int[] {40,40,40}));//student2
		assertEquals(50,MarksCard.checkMarksCard(new int[] {50,50,50}));//student3
		
	}

}
