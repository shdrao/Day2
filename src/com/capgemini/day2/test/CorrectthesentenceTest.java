package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.CorrectTheSentence;

class CorrectthesentenceTest {

	@Test
	void testCorrectTheSentence() {
		assertEquals("Success", CorrectTheSentence.checksentence(2,"A   MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY."));
		assertEquals("Success", CorrectTheSentence.checksentence(3,"A   MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY."));
	}

}

