import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWaitEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org");
		driver.findElement(By.id("searchInput")).sendKeys("India");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		
		

	}

}
