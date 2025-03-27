package com.sunseed.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	Properties properties;
	String path ="C:\\Users\\user\\eclipse-workspace\\Agri.Sunseed\\Configuration\\config.properties";

	public void readconfig() {
		try {
		properties = new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			fis.close();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	public String getbaseurl()
	{
		readconfig();
		String value= properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	public String getbrowser()
	{
		readconfig();
		String value= properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not specified in config file");
	}
	

}
