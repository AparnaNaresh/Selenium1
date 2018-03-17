package testng;

import org.testng.annotations.Test;

public class SeleniumListenerDemo1 extends SeleniumListeners {
	
	@Test
	public void abc()
	{
		driver.get("https://www.google.com/");
		driver.quit();
		
	}

}
