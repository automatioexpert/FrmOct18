package listners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Report.ExtentManager;
import base.TestBase;
import utilities.Screenshot;

public class customeListener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {

		//ExtentManager.createTest(result.getMethod().getMethodName());
		test=rep.createTest(result.getMethod().getMethodName());
		test.log(Status.INFO, "Started executing test case: "+result.getMethod().getMethodName());
		rep.flush();
	}

	public void onTestSuccess(ITestResult result) {
	//	test =rep.createTest("", "");
		test.log(Status.PASS, "Test Case Name: " + result.getMethod().getMethodName() + " Passed.");
		rep.flush();

	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot.getBase64()).build());
		test.log(Status.FAIL, "Test Case Name: " + result.getMethod().getMethodName() + " Failed.");
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case Name: " + result.getMethod().getMethodName() + " Skipped.");
		rep.flush();
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
//		test.log(Status.INFO, "Started executing testcase: "+context.getName());
//		rep.flush();

	}

	public void onFinish(ITestResult result) {
//
		test.log(Status.INFO, "Completed executing test case: "+result.getMethod().getMethodName());
		rep.flush();
		
	}

}
