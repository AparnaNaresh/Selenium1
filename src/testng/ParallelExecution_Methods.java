package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelExecution_Methods {
	 WebDriver driver;
  @Test
  public void test1() {
	  System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  
  }
  @Test
  public void test2() {
	  System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 String title = driver.getTitle();
		  System.out.println(title);
  }
  
  
  @AfterMethod
  public void close()
  {
	  driver.quit();
  }
}
