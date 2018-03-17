package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;


public class Scrolling {
	
	public static WebDriver driver;
	@Test
	public static void scroll() throws InterruptedException
	{
		General g = new General(driver,"http://www.eenadu.net/");
		Thread.sleep(10000);
		
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		driver.quit();
		
	}
	
}
