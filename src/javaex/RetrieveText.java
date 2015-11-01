package javaex;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RetrieveText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open FF Browser
		FirefoxDriver driver=new FirefoxDriver(); // driver is an object for the class FirefoxDriver
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//h2[text()='Sign Up']")).getText();

		WebElement e = driver.findElement(By.xpath("//h2[text()='Sign Up']"));
		String text1 = e.getText();


		System.out.println(text);

	}

}
