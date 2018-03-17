package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.gson.JsonSerializationContext;

public class JavaScriptExecutor1 {
	
	
	public WebDriver driver;
	@Test
	public void javaScriptExecutor() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=\"name\"", driver.findElement(By.cssSelector("#email")));
		js.executeScript("arguments[0].value=\"test\"", driver.findElement(By.cssSelector("#pass")));
		//js.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("#input[value='Log In']")));
		js.executeScript("document.getElementById(\"u_0_e\").value=\"name\"");
		
		Thread.sleep(1000);
		
		
		}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	
	
}