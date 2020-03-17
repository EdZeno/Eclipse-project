package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Fizz {

	private final FizzBuzz fizz = new FizzBuzz();
	int number = fizz.value(12);
	
	@Test
	void testFizzBuzz() {
        assertEquals( "Fizz", fizz.fizzBuzz(number));
	}
	
}
