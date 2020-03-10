package fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	private final FizzBuzz fizz = new FizzBuzz();
	
	@Test
	void testFizzBuzz() {
        assertEquals( "Fizz", fizz.fizzBuzz(5));
	}

}
