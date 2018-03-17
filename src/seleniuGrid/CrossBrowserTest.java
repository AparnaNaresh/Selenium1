package seleniuGrid;

import org.testng.annotations.Test;

public class CrossBrowserTest extends GridCode {
	
	
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com/");
	}

}
