package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation1 {
@BeforeTest
	
	public void launchBrowser()
	{
		System.out.println("browser launched");
		Assert.assertTrue(true);
	}
	@Test
	public void test1()
	{
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Browser Closed ");
		Assert.assertTrue(true);
	}
}
