package com.db.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.db.testBase.TestBase;

public class CommonMethods extends TestBase
{
	public static String captureScreenshot(String filename)
	{
		String path = System.getProperty("user.dir")+"//Screenshots//"+filename+"_"+System.currentTimeMillis()+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		try {
			FileHandler.copy(src, des);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return path;
	}
	public static void explicitWaitHandle(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(elem));
	}
}
