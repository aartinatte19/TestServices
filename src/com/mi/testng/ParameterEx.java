package com.mi.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {

	WebDriver driver;
	@Parameters({"url"})
	@BeforeClass
	public void invokeBrowser(String url)
	{
	driver = new FirefoxDriver();
	driver.get(url);
	}
	
	@Test
	public void verifyTitle()
	{
		Assert.assertEquals("Google","Google");
	}
}
