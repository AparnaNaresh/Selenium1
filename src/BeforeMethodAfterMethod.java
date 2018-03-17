import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
	public String baseURL = "http://demo.guru99.com/selenium/newtours/";
	public String driverPath = "E:\\Aparna\\Selenium\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;

	@BeforeTest
	public void launchbrowser()
	{
		 System.out.println("launching chrome browser");
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	}
  @BeforeMethod
  public void verifyHomepageTitle() {
	 
	  driver.get(baseURL);
	  String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
     
  }
  
  @Test(priority =0)
  public void clickSupport()
  {
	  driver.findElement(By.linkText("SUPPORT")).click();
	  expected = "Under Construction: Mercury Tours";
	  actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  @Test(priority =1)
 public void clickRegister()
 {
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected = "Register: Mercury Tours";
	  actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
 }
  @AfterMethod
  public void goBackToHomepage ( ) {
      driver.findElement(By.linkText("Home")).click() ;
}
  
  @AfterTest
  public void closebrowser()
  {
	  driver.close();
  }
}
