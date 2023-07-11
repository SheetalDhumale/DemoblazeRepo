package com.db.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.db.utility.CommonMethods;
import com.db.utility.ListenerSetup;

public class ProductListPage extends ListenerSetup
{
	public ProductListPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	private WebElement product;
	public void clickOnProduct()
	{
		CommonMethods.explicitWaitHandle(product);
		product.click();
	}
}
