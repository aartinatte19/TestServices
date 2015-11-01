import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MaximisePageEx {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension d = new Dimension(200,200);
		driver.manage().window().setSize(d);

	}

}
