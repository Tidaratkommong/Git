package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testfizzbuzz1 {

	@Test
	void test8_input_8() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(8);
		assertEquals("8", input);
	}

}
