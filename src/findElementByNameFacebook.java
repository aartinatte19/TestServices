import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementByNameFacebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 FirefoxDriver driver=  new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.name("email")).sendKeys("facebook");
		 driver.findElement(By.name("pass")).sendKeys("welcome");
		 driver.findElement(By.name("login")).click();

	}
 
}
