/*
 1. DataProvider annotation will execute the test under this annotattion and store the data in array format
 2. when its called test will be executed for each data set which is stored in DataProvider 
 */




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

import lib.ReadExcel;

import org.testng.annotations.*;

public class DataProviderwithExcel {

	
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
		ReadExcel r = new ReadExcel("C:\\Users\\ndulam_in\\Desktop\\Aparna_Java\\TestData.xlsx");
		
		int row = r.getRowCount(0);
		Object[][] data = new Object[2][2];
		
		for(int i=0; i<=1;i++)
		{
			data[i][0] = r.getData("Login", i, 0);
			data[i][1] = r.getData("Login", i, 1);
			
		}
		

				
		
		
		return data;
		
	}
	
	public void  takeScreenshot() throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,  new File("E:/SeleniumScreenshots/"+System.currentTimeMillis()+".png"));
	}
}
