package overridding;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test case start here :************");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("test case start here :************");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
