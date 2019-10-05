package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testfizzbuzz1 {

	@Test
	void test2_input_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(2);
		assertEquals(2, input);
	}

}
