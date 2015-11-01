import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class facebookApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //1. Open FF Browser
		FirefoxDriver driver=new FirefoxDriver(); // driver is an object for the class FirefoxDriver
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		String expected = "Welcome to Facebook-Log In, Sign Up or Learn More";
		if(actual.equals(expected))
		{
			System.out.println("TC is passed");
		}
		else{
			System.out.println("TC is failed");
		}
		//REtrieve the hyperlinks available in the page and get the count of it.
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		//Retrieve the text displayed for all the hyperlinks available in the page
		for(int i =0;i<list.size();i++)
		
		{
			//System.out.println(list.get(i).getText());
			
			//Retreive the href attribute value for all the hyperlinks
			System.out.println(list.get(i).getAttribute("href"));
		}
		
		
		driver.close();

	}

}

/**
 * TC_001
 * Objective : Verify the title of the page
 * 
 * TestSteps -> 
 * 1. Open FF Browser
 * 2. Enter the url as "https://www.facebook.com/"
 * 3. Capture the title of the page
 * 
 * Expected Value->
 * Welcome to Facebook-Log In, Sign Up or Learn More
 * 
 * Acutal Value->
 * 
 * 
 * Status -> PAss / Fail
 * 
 * 
 * 
 * 
 */
