package com.db.pageLayer;

import java.util.List;

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
	@FindBy(xpath="//div[@class='col-lg-4 col-md-6 mb-4']//h4")
	private List<WebElement> lists;
	public int listOfProduct() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("List of products : ");
		int i =0;
		for(WebElement product_name : lists)
		{
			i++;
			System.out.println(product_name.getText());
		}
		return i;
		
	}
}
