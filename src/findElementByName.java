import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementByName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 FirefoxDriver driver=  new FirefoxDriver();
		 driver.get("file:///D:/SeleniumWorkproducts/HTML/HTML/LoginPage.html");
		 driver.findElement(By.name("username")).sendKeys("selenium");
		 driver.findElement(By.name("password")).sendKeys("welcome");
		 driver.findElement(By.name("login")).click();

	}

}
