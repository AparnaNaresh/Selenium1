package testng;

import org.testng.annotations.Test;

public class GroupingTestCases {
 
	
	@Test(groups={"sanity","regression"},priority=1)
	public void login()
	{
		System.out.println("login");
	}
	@Test(groups={"sanity","regression"},priority=6)
	public void logout()
	{
		System.out.println("logout");
	}
	@Test(groups={"sanity"},priority=3)
	public void search()
	{
		System.out.println("search");
	}
	@Test(groups={"regression"},priority=4)
	public void advancedSearch()
	{
		System.out.println("billpayment");
	}
	@Test(groups={"regression"}, priority=5)
	public void billpayment()
	{
		System.out.println("billpayment");
	}
}
