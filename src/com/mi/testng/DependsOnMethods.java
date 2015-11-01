package com.mi.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void login()
	{
		System.out.println("in login");
	}
	
	@Test(dependsOnMethods={"login"},description="")
	public void search ()
	{
		System.out.println("in search");
		Assert.assertEquals("a","b");
	}
	
	@Test(dependsOnMethods={"search"})
	public void logout()
	{
		System.out.println("in logout");
	}
}
