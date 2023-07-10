package com.db.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.db.utility.ListenerSetup;

public class HomePageTest extends ListenerSetup
{
	@Test()
	public void verifyLogin() throws IOException
	{
		String logged_user = home.userLogin();
		test.info("User entered details and clicked on login button");
		System.out.println(logged_user);
		Boolean status = logged_user.contains("Welcome");
		Assert.assertEquals(status, true);
	}
}
