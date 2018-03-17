package testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	public static WebDriver driver;
	@Test
	public void windowHandle() throws InterruptedException
	{
		General g = new General(driver,"https://www.naukri.com/");
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[contains(text(),'Pay Bills')]/following::a[1]")).click() 
		 String parent = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator();  
		
		
		while(itr.hasNext())
		{
			String wind =itr.next();
			if(!wind.equalsIgnoreCase(parent));
			driver.close();
		}
			
		driver.switchTo().window(parent);
		
	}
}
