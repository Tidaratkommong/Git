package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testfizzbuzz1 {

	@Test
	void test6_input_6() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(6);
		assertEquals("Fizz", input);
	}

}
