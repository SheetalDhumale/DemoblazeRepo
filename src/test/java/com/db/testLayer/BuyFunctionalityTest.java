package com.db.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.utility.ListenerSetup;

public class BuyFunctionalityTest extends ListenerSetup
{
	@Test
	public void BuyProduct() throws IOException, InterruptedException
	{
		home.userLogin();
		test.info("Logged In");
		home.clickOnPhones();
		test.info("Navigated to Phones page");
		prod_list.clickOnProduct();
		test.info("Selected product");
		String alert_text = product.clickOnAddToCart();
		test.info("Product added to cart");
		Assert.assertEquals(alert_text, "Product added.");
	}
}
