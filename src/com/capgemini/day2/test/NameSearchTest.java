package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.NameSearch;

class NameSearchTest {

	@Test
	void testNameSearch() {
		assertEquals(1,NameSearch.checkname("abc", new String[] {"abc","def","ghi","jkl"}));
		assertEquals(2,NameSearch.checkname("abc", new String[] {"abc","abc","ghi","jkl"}));
		assertEquals(0,NameSearch.checkname("xyz", new String[] {"abc","abc","ghi","jkl"}));
	}

}
