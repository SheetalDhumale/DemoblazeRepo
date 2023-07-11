package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.utility.CommonMethods;
import com.db.utility.ListenerSetup;

public class ProductPage extends ListenerSetup
{
	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addToCart_btn;
	public String clickOnAddToCart() throws InterruptedException
	{
		CommonMethods.explicitWaitHandle(addToCart_btn);
		addToCart_btn.click();
		Thread.sleep(4000);
		String alert_txt= driver.switchTo().alert().getText();
		return alert_txt;
	}
}
