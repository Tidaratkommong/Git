package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testfizzbuzz1 {

	@Test
	void test1_input_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(1);
		assertEquals(1, input);
	}

}
