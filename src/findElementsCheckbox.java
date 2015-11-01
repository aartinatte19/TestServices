import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class findElementsCheckbox {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///D:/SeleniumWorkproducts/HTML/HTML/MultipleCheckbox.html");
		List<WebElement> list = driver.findElements(By.name("chk"));
		System.out.println(list.size());
		
	//	list.get(1).click();
		
		for(int i =0;i<list.size();i++)
		{
			list.get(i).click();
		}
		
		
	}

}
