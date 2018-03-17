/*
 1. To create dependancy between one test case and other test case @dependsOnMethod is used
 2. @Test(dependsOnMethods ="Method") 
 */
package testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityAttribute {
	private static final String alwasyrun = null;
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser Launched");
	}
	@Test(priority=2)
	public void startApp()
	{
		
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://opensource.demo.orangehrmlive.com/"));
		System.out.println("Applicatoin started");
	}
	
	@Test(priority=3)
	public void startApp1()
	{
		
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://opensource.demo.orangehrmlive.com/"));
		System.out.println("Applicatoin started");
	}
	
	
	@Test(alwaysRun=true)
	public void CloseApp()
	{
		driver.quit();
		System.out.println("Closed App");
	}
}
