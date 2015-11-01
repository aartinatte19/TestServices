import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementById {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 FirefoxDriver driver=  new FirefoxDriver();
		 driver.get("file:///D:/SeleniumWorkproducts/HTML/HTML/LoginPage.html");
		 driver.findElement(By.id("username")).sendKeys("selenium");
		 driver.findElement(By.id("pass word")).sendKeys("welcome");
		 driver.findElement(By.id("login")).click();

	}
 
}
