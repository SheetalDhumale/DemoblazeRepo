package com.db.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.db.testBase.TestBase;

public class ExtentReportGen extends TestBase
{
	public static ExtentReports extent;
	public static ExtentReports ExtentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"//reports//ExecutionReport_"+System.currentTimeMillis()+".html";
		ExtentHtmlReporter report = new ExtentHtmlReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(report);
		report.config().setTheme(Theme.DARK);
		report.config().setReportName("Demoblaze Execution Report");
		extent.setSystemInfo("Browser used", "Chrome");
		extent.setSystemInfo("Executed By", "QA team");
		extent.setSystemInfo("Env used", "SIT");
		return extent;
	}
}
