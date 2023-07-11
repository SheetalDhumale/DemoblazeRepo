package com.db.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.utility.ListenerSetup;

public class BasicFunctionalityTest extends ListenerSetup
{
	@Test
	public void listPrint() throws IOException, InterruptedException
	{
		home.userLogin();
		test.info("Logged in");
		home.clickOnMonitors();
		test.info("Navigated to Monitors page");
		int list_count = prod_list.listOfProduct();
		test.info("Product list fetched");
		Assert.assertEquals(list_count, 2);
	}
}
