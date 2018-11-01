import static org.junit.Assert.*;

import org.junit.Test;

public class Lab9Test {

	@Test
	public void testFibonacci() {
		assertEquals(34, Lab9.fibonacci(-9));
	}

	@Test
	public void testSumDigits() {
		assertEquals(6, Lab9.sumDigits(123));
	}

	@Test
	public void testIsPalindrome() {
		assertTrue(Lab9.isPalindrome("noon"));
		assertFalse(Lab9.isPalindrome("Cat"));
	}

	@Test
	public void testMaxValue() {
		Integer[] a = {1, 6, 3};
		assertTrue(Lab9.maxValue(a).equals(6));
		assertFalse(Lab9.maxValue(a).equals(1));
	}
}
