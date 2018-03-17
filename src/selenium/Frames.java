package selenium;
// not working
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Frames extends GeneralComponents{

	@Test
	public void test() 
	{
		GeneralComponents g = new GeneralComponents();

		
		
		g.login("https://www.facebook.com/");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='lfloat _ohe'] h1 a i u")));
		System.out.println(driver.findElement(By.cssSelector("div[class='lfloat _ohe'] h1 a i u")).getText());
		g.close();
		
	}
	
}