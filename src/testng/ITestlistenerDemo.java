package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.ITestListener;

	
public class ITestlistenerDemo {

	
	
	@Test
	public void test1()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}
}
