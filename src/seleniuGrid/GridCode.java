package seleniuGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GridCode {
	
	public ThreadLocal<RemoteWebDriver> dr = new ThreadLocal<RemoteWebDriver>();
	
	public WebDriver wdr= null;
	
	public RemoteWebDriver driver = null;
	
	@BeforeTest
	@Parameters(value="browsername")
	public void setUp(String browser)
	{
		if(browser.equals("firefox"))
		{
			DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
			capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.WINDOWS);
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"),capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WINDOWS);
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.1.3:5555/wd/hub"),capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setwebriver(driver);
			
		
	}
	
	public void setwebriver(RemoteWebDriver driver)
	{
		dr.set(driver);
	}

	public WebDriver getWebDriver()
	{
		return dr.get();
		
	}
	
	@AfterClass
	public void quit()
	{
		getWebDriver().quit();
	}
}
