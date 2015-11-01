import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("file://D:/Selenium/HTML/LoginPage.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String title = (String) jse.executeScript("return document.title");
		System.out.println(title);
		
		String status = (String) jse.executeScript("return document.readyState");
		System.out.println(status);
		
		Object o = jse.executeScript("return document.getElementById");
		WebElement e = (WebElement) o;
		e.sendKeys("selenium");
		
		System.out.println();

	}

}
