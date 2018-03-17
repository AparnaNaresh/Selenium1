package testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation2 {

	

	@Test
	public void test3()
	{
		System.out.println("Test1");
		Assert.assertTrue(true);
	}
	@Test
	public void test4()
	{
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
	
}
