package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
