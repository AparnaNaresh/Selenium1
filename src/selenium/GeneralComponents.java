package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralComponents {
	public WebDriver driver;
	
	public void login(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//ndulam_in//Desktop//Aparna_Java//SeleniumJars//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	}
	public void close()
	{
		driver.close();
	}
}
