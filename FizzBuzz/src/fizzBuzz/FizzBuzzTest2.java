package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest2 {
	private final FizzBuzz fizz = new FizzBuzz();

	@Test
	void testValue() {
		assertEquals(1, fizz.value(3));
	}

}
