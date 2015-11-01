package com.mi.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	@BeforeClass
	public void login()
	{
		System.out.println("in login");
	}

	@Test
	public void testcase_001()
	{
		System.out.println("testcase_001");
	}
	@Test
	public void testcase_002()
	{
		System.out.println("testcase_002");
	}
	@Test
	public void testcase_003()
	{
		System.out.println("testcase_003");
	}
	@Test
	public void testcase_004()
	{
		System.out.println("testcase_004");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("in logout");
	}

}
