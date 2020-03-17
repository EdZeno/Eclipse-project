package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private final FizzBuzz fizz = new FizzBuzz();
	int number = fizz.value(15);
	
	@Test
	void testFizzBuzz() {
        assertEquals( "FizzBuzz", fizz.fizzBuzz(number));
	}

}
