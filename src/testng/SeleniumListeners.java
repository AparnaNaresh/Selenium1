package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumListeners {
	public WebDriver dr;
	public EventFiringWebDriver driver;
	public WebEventListener eventListener;
	@Test
	public void test1()
	{
		
	
		dr = new FirefoxDriver();
		driver = new EventFiringWebDriver(dr);
		eventListener = new WebEventListener();
		driver.register(eventListener);
		Assert.assertTrue(true);
	}
}
