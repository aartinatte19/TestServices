package com.mi.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityEx {
	@Test(priority=1,description="Login to Application") 
	public void login()
	{
		System.out.println("in login");
	}
	
	@Test(priority=2,description="Search the Application")
	public void search ()
	{
		System.out.println("in search");
		Assert.assertEquals("selenium","Selenium");
	}
	
	@Test(priority=3,description="TC_003 Logout of the Application",enabled=false)
	public void logout()
	{
		System.out.println("in logout");
	}

}
