package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Palindome;

class PalindromeTest {

	@Test
	void testPalindrome() {
		assertEquals("Palindrome", Palindome.checkPalindrome(12321));
		assertEquals("Not Palindrome", Palindome.checkPalindrome(123210));
	}

}
