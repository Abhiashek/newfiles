package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Test is Start");
	}
	
	public void onTestSucess(ITestResult Result)
	{
		System.out.println("Test case is sucessfuly passed");
	}
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Take Screenshot on Failure");
	}

}
