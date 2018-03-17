/*
    using 
    TestNG class and setTestSuites we can run failed test cases instead of manually running failed xml each ev 
 	every time
 */



package failedtestcaseRerun;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RerunFailedTest_TestNG {

	
	
	public static void main(String args[])
	{
		TestNG test = new TestNG();
		
		List<String> li = new ArrayList<String>();
		
		li.add("E:\\Aparna\\TestNG\\TestNG_1\\FirstTestNGProject\\test-output\\Default suite\\testng-failed.xml");
		
		test.setTestSuites(li);
		
		test.run();
		
		
		
	}
}
