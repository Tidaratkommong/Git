package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testfizzbuzz1 {

	@Test
	void test10_input_10() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(10);
		assertEquals("Buzz", input);
	}

}
