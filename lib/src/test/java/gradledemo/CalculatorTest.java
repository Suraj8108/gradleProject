package gradledemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calcProject.Calculator;

class CalculatorTest {

	@Test
	void test() {
		
		Calculator c1 = new Calculator();
		int expected = 4;
		int actual = c1.checkWorks(2, 2);
		
		assertEquals(expected, actual);
	}

}
