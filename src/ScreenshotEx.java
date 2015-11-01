import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenshotEx {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		FirefoxDriver driver=new FirefoxDriver();
//		driver.get("http://www.google.com");
//		
//		TakesScreenshot tsh = new FirefoxDriver();
//		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		TakesScreenshot tsh = (TakesScreenshot) driver;
		File srcfile = tsh.getScreenshotAs(OutputType.FILE);
	    System.out.println(srcfile.getAbsolutePath());
	    FileUtils.copyFile(srcfile, new File("d:\\google.jpg"));
	}

}
