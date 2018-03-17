package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class DataProvider {

	
	WebDriver driver;
	
	
	@Test(dataProvider="testdata")
	
	public void  facebook (String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		driver.findElement(By.cssSelector("#u_0_2")).click();
		try {
			takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	@org.testng.annotations.DataProvider(name="testdata")
	public Object[][] providedata()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "user1";
		data[0][1]="pass1";
		data[1][0]="user2";
		data[1][1]="pass2";
				
		
		
		return data;
		
	}
	
	public void  takeScreenshot() throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,  new File("E:/SeleniumScreenshots/"+System.currentTimeMillis()+".png"));
	}
}
