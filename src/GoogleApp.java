import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //1. Open FF Browser
		FirefoxDriver driver=new FirefoxDriver(); // driver is an object for the class FirefoxDriver
		driver.get("http://www.google.com");
		String actual = driver.getTitle();
		String expected = "Google";
		if(actual.equals(expected))
		{
			System.out.println("TC is passed");
		}
		else{
			System.out.println("TC is failed");
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
 * 2. Enter the url as "http://www.google.com"
 * 3. Capture the title of the page
 * 
 * Expected Value->
 * Google
 * 
 * Acutal Value->
 * 
 * 
 * Status -> PAss / Fail
 * 
 * 
 */
