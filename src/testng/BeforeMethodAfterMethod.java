package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod 
{
	
	@BeforeMethod 
	
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
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Browser Closed ");
		Assert.assertTrue(true);
	}
}
