package com.db.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.db.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener
{
	ExtentReports extent = ExtentReportGen.ExtentReportGenerator();
	static ExtentTest test;
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Execution started : "+result.getName());
		test = extent.createTest(result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Execution passed : "+result.getName());
		test.log(Status.PASS, "Test Execution Passed");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Execution failed : "+result.getName());
		test.fail(result.getThrowable());
		try
		{
			test.addScreenCaptureFromPath(CommonMethods.captureScreenshot(result.getName()));
		}
		catch (IOException e)
		{
			System.out.println("Exception during attaching screenshot in report");
		}

	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Execution skipped : "+result.getName());
		test.log(Status.SKIP, "Test Execution Skipped");
	}
	public void onStart(ITestContext context)
	{
		System.out.println("Test tag started : "+context.getName());
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("Test tag finished : "+context.getName());
		extent.flush();
	}
}
