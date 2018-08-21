package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Search;

class SearchTest {

	@Test
	void testSearch() {
		
		assertEquals(true, Search.checkSearch(371,new int[] { 153, 370, 371, 407 }) );
		assertEquals(false, Search.checkSearch(100,new int[] { 153, 370, 371, 407 } ));
	}

}
