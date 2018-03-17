/*
 1. In SoftAssertion, when test fails it will not terminate the program unlike HardAssertion
 2. First create object of SoftAssert  Class  which is present org.testng.asserts and call assertAll()method on that object then only we
 cab acheive Soft Assertion
 */

package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;



public class SoftAssertion {

	
	@Test
	public void softAssert()
	{
		System.out.println("softAssert Test Started");
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals("a", "b","softAssert Test Failed");
		System.out.println("softAssert Test completed");
		assertion.assertAll();
		
	}
	
	@Test
	public void hardAssert()
	{
		System.out.println("hardAssert Test Started");
		Assert.assertEquals(1, 2,"Test Failed");
		
		System.out.println("hardAssert Test completed");
		
		
	}
}
