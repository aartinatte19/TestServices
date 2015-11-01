import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActionsEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///D:/SeleniumWorkproducts/HTML/HTML/ActionsEx.html");

		WebElement mainMenu = driver.findElement(By.className("menuHead"));
		WebElement subMenu = driver.findElement(By.xpath(".//*[@id='menu1choices']/a[4]"));

		Actions action = new Actions(driver);
		action.moveToElement(mainMenu);
		action.moveToElement(subMenu);
		action.click();
		action.perform();
		//sYNTAX
		//Classname objname = new Classname();
		
	}

}
