import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementByNameRediff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 FirefoxDriver driver=  new FirefoxDriver();
		 driver.get("http://www.rediff.com/");
		 driver.findElement(By.linkText("Create a Rediffmail account")).click();
		 driver.findElement(By.name("name390dd930")).sendKeys("aarti");
		 driver.findElement(By.name("loginbd03101f")).sendKeys("abc");
		 driver.findElement(By.name("btnchkavailbd03101f")).click();
		 
	}

}
