import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingWindows {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.linkText("Data Policy")).click();
		
		//Retrieves the name of the window which has focus - fb
		String parent = driver.getWindowHandle();
		
		String title = driver.getTitle();//title is string variable
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		//Names of fb & DP
		Set<String> wlist = driver.getWindowHandles();
		
//		if (parent != wlist(2))
//		{
//			driver.switchTo().window(wlist(2));
//			System.out.println(driver.getTitle());
//		}
		
		// for each in case of non-indexing we have to use this
		for(String child : wlist)
		{
			if(!(parent.equals(child)))  //parent!=child
			{
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				 
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
