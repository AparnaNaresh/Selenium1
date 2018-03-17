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

public class BeforeMethods {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser Launched");
	}
	@Test(priority=1)
	public void startApp()
	{
		
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("http://opensource.demo.orangehrmlive.com/"));
		System.out.println("Applicatoin started");
	}
	@Test(priority=2,dependsOnMethods="startApp")
	public void loginApp()
	{
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		boolean status = driver.findElement(By.xpath(".//*[@id='welcome']")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println("Successfully logged in");
	}
	@Test(priority=3,dependsOnMethods="loginApp")
	public void logoutApp()
	{
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='btnLogin']")).isDisplayed());
		
		
	}
	@AfterClass
	public void CloseApp()
	{
		driver.quit();
		System.out.println("Closed App");
	}
}
