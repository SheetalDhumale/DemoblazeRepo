package com.db.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader
{
	public String getValue(String valueToRead) throws IOException
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(valueToRead);
		return value;
	}
}
