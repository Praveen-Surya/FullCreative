package org.full.test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.full.main.StringHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestStringHandler {

	private String oldString;
	private String newString;
	private String expectedResult;
	private StringHandler stringHandler;

	public TestStringHandler(String oldString, String newString, String expectedResult) {
		this.oldString = oldString;
		this.newString = newString;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initilize() {
		stringHandler = new StringHandler();
	}

	@Test
	public void testStringHandler() {
		assertEquals(expectedResult, stringHandler.replaceString(oldString, newString));
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { "a", "b", "Jbvb is b Progrbmming Lbngubge" },
				{ " ", "b", "JavabisbabProgrammingbLanguage" }, { "a", " ", "J v  is   Progr mming L ngu ge" },
				{ "a", "1", "J1v1 is 1 Progr1mming L1ngu1ge" }, { "a", "*", "J*v* is * Progr*mming L*ngu*ge" },
				{ "z", "a", "Java is a Programming Language" },
				{ "Java", "Python", "Python is a Programming Language" } });
	}

}
