/*---- TestNG is a uniten testing framework. It will generate default reports. 3rd party tool 
 used along with selenium to generate reports 
 1. Annotatoins controls the flow of execution of the of test case
 2. @Test refers to a test case
 3. By default test's will be executed in alphabetical order
 4.To change the the execution order we have pass priority parameter to @Test arguments, TestNG will accept negative priorities
 and it will have highest priority.
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGProject {
	
	public String baseURL = "http://demo.guru99.com/selenium/newtours/";
	public String driverPath = "E:\\Aparna\\Selenium\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	
	
	@BeforeTest
	public void launchbrowser()
	{
		 System.out.println("launching chrome browser");
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	}
//  @Test
//  public void verifyHomepageTitle() {
//	 
//	  driver.get(baseURL);
//	  String expectedTitle = "Welcome: Mercury Tours";
//      String actualTitle = driver.getTitle();
//      Assert.assertEquals(actualTitle, expectedTitle);
//     
//  }
	@Test
	public void login()
	{
		driver.get("w");
		
	}
	
  
  @AfterTest
  public void closebrowser()
  {
	  driver.close();
  }
}
