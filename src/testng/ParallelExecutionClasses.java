package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelExecutionClasses {
	 WebDriver driver;
 @Test
 public void test1() {
	
	
	 System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
	 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String title = driver.getTitle();
	  System.out.println(title);
	  long thread = Thread.currentThread().getId();
		System.out.println("Thread name is "+thread);
	  
 }
 @Test
 public void test2() {
	 System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
	 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  String title = driver.getTitle();
	  System.out.println(title);
	  long thread = Thread.currentThread().getId();
		System.out.println("Thread name is "+thread);
 }
 
 
 @AfterMethod
 public void close()
 {
	  driver.quit();
 }
}
