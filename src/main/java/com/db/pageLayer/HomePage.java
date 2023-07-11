package com.db.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.testBase.TestBase;
import com.db.utility.CommonMethods;
public class HomePage extends TestBase
{
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login2")
	private WebElement login_link;
	@FindBy(id="loginusername")
	private WebElement username_txt;
	@FindBy(id="loginpassword")
	private WebElement password_txt;
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login_btn;
	@FindBy(xpath="//a[@id='nameofuser']")
	private WebElement logged_user_name;
	public String userLogin() throws IOException
	{
		login_link.click();
		username_txt.sendKeys(cr.getValue("username"));
		password_txt.sendKeys(cr.getValue("password"));
		login_btn.click();
		CommonMethods.explicitWaitHandle(logged_user_name);
		String name = logged_user_name.getText();
		return name;
	}
	@FindBy(xpath="//a[text()='Phones']")
	private WebElement phones_link;
	
	public void clickOnPhones()
	{
		phones_link.click();
	}
	@FindBy(xpath="//a[text()='Monitors']")
	private WebElement monitors_link;
	public void clickOnMonitors()
	{
		monitors_link.click();
	}
	
}
