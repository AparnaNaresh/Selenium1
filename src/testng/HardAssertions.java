package testng;
/* 1.Assertions will generate errors not exceptions
	2. Hard Assertion is if verification got failed program will be terminated
	3. Assert is a Java Class
*/


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	public void test1()
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println("Test1 Started");
		Assert.assertEquals(10, 11,"Test failed as expected is not same as actula");
		
				System.out.println("d iest2 Completed");
	}
@Test
	
	public void test2()
	{
		System.out.println("Test2 Started");
		Assert.assertEquals(10, 10);
		System.out.println("Test3 Completed");
	}

@Test
public void test3()
{
	System.out.println("Test3 Started");
	Assert.assertTrue(false,"test failed as value is false");
	
	
}
@Test
public void test4()
{
	System.out.println("Test 4 Started");
	String s = "aparna";
	Assert.assertTrue(s.contains("aparna"));
	

}

}
