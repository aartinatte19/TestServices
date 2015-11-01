import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImplicitWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_b")).sendKeys("Selenium");
		driver.findElement(By.id("u_0_d")).sendKeys("WebDriver");
		
		
	}

}
