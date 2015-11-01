package com.mi.testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleApp {

	@Test
	public void verifyTitle()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String actual = driver.getTitle();
		String expected = "Google";
		Assert.assertEquals(expected, actual);

	}

}
