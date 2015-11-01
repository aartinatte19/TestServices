import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementByIdFacebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=  new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("aarti");
		driver.findElement(By.name("lastname")).sendKeys("natte");
		driver.findElement(By.name("hyihyohhkjhkjkkj((&&*&* ")).sendKeys("0123456789");
		driver.findElement(By.id("u_0_k")).sendKeys("welcome");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("websubmit")).click();
	}

}
