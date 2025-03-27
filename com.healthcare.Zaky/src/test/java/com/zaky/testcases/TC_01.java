package com.zaky.testcases;

import org.testng.annotations.Test;

import com.healthcare.pageobject.landingpage;

public class TC_01 extends BaseClass{

	@Test
	public void login()
	{
		driver.get(url);
		landingpage lg=new landingpage(driver);
		lg.clickonbtn();
	}
}
