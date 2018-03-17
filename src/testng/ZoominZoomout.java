package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
public class ZoominZoomout {
	public static WebDriver driver;
	@Test
	public void zooming() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='10%'");
		Thread.sleep(10000);
//		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
		driver.quit();
	}
}
