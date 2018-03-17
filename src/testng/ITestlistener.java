package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestlistener implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test Case Execution finished");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Test Case Execution started");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Test Case Execution passed with cosmetic errors");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test Case Execution Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Case Execution Skipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Case Execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test Case Execution success");
		
	}

}
