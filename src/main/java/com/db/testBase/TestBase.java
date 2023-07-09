package com.db.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.db.utility.ConfigReader;

public class TestBase
{
	public static WebDriver driver;
	@BeforeMethod
	public void initBrowser() throws IOException
	{
		ConfigReader cr = new ConfigReader();
		String br = cr.getValue("browser");
		if(br.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Wrong browser input");
		}
		driver.get(cr.getValue("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
