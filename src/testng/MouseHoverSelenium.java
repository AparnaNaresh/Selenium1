package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverSelenium {
	WebDriver driver;
	
	@Test
	public void mouseHover() throws InterruptedException
	{
		General g = new General(driver,"https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("span#glow-ingress-line2"))).perform();
		
		
	}
}
