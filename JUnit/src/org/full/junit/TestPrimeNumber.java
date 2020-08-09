package org.full.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPrimeNumber {

	private PrimeNumber primeNumber;

	@Before
	public void initilize() {
		primeNumber = new PrimeNumber();
	}

	@Test
	public void primeNumberTest() {
		assertFalse(primeNumber.PrimeNumberCheck(29));

	}

	@Test
	public void notAPrimeNumberTest() {
		assertTrue(primeNumber.PrimeNumberCheck(27));

	}

}
