package com.mi.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class GoogleTests {

	@Test
	public void verifyTitle()
	{
		String actual= "abc";
		String expected = "Google";

		AssertJUnit.assertEquals(actual, expected);
	}

	@Test
	public void a()
	{
		System.out.println("in a");
	}
	@BeforeTest
	public void setUp()
	{
		System.out.println("Executing the test cases for the project");
	}
}
