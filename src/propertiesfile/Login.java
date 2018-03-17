package propertiesfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login extends TestBase {

	
	@Test
	public void login()
	{System.out.println(pr.getProperty("URL"));
		WebDriver driver = new FirefoxDriver();
		driver.get(pr.getProperty("URL"));

		driver.findElement(By.cssSelector(pr.getProperty("UsernameXpath"))).sendKeys(pr.getProperty("username"));

		driver.findElement(By.cssSelector(pr.getProperty("PasswordXpath"))).sendKeys(pr.getProperty("password"));
	
	}
	
}
