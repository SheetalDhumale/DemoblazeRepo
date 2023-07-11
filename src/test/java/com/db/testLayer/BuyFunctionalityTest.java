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
		home.clickOnPhones();
		prod_list.clickOnProduct();
		String alert_text = product.clickOnAddToCart();
		Assert.assertEquals(alert_text, "Product added.");
	}
}
