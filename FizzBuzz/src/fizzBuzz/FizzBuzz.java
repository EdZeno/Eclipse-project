package fizzBuzz;

public class FizzBuzz {
	
	public int value(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return 35;
		}
	    else if (number % 3 == 0) {
			return 3;
		} 
		else if (number % 5 == 0) {
			return 5;
		} else {
			return 0;
		}
	}
    
	
	public String fizzBuzz(int number) {
		switch(number) {
		case 35:
			return "FizzBuzz";
		case 3:
			return "Fizz";
		case 5:
			return "Buzz";
			default:
				return "Wrong";
		}
		
	}
	
	public static void main(String[] args) {
//		FizzBuzz fizz = new FizzBuzz();
	}

}
