package com.jenkins.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoNumbersTest {

	@Test
	public void testNumbers() {

		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		assertEquals(16, addTwoNumbers.addTwoNumbers(12, 4));
	}

}
