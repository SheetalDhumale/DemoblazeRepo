package com.db.testLayer;

import org.testng.annotations.Test;

import com.db.utility.ListenerSetup;

public class BasicTest extends ListenerSetup
{
	@Test()
	public void basic()
	{
		System.out.println("URL launched");
	}
}
