package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuzzTest {

	private final FizzBuzz fizz = new FizzBuzz();
	int number = fizz.value(10);
	
	@Test
	void testFizzBuzz() {
        assertEquals( "Buzz", fizz.fizzBuzz(number));
	}

}
