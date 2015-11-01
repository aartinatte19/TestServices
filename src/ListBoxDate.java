import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBoxDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		//1. Open FF Browser
		FirefoxDriver driver=new FirefoxDriver(); // driver is an object for the class FirefoxDriver
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		Select mselect = new Select(day);
		mselect.selectByVisibleText("19");
		
		

	}

}
