package testng;

import org.testng.annotations.Test;

public class TestNGFirstScript {
	@Test(priority=1, description="this test case will verify login functionality ")
	public void loginApplicatoin()
	{
		System.out.println("first testng program");
	}
	@Test(priority=2,description="this test case will add selected items ")
	public void selectItems()
	{
		System.out.println("item selected");
	}
	@Test(priority=3,description="this test case will verify checkout functionality")
	public void checkout()
	{
		System.out.println("checked out");
	}
}
