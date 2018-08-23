package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Removeduplicate;

class RemoveDuplicatetest {

	@Test
	void testRemoveDuplicate() {
		assertEquals("abc", Removeduplicate.checkduplicate("abcabcabc"));
		assertEquals("xyz", Removeduplicate.checkduplicate("xyz"));
	}

}
