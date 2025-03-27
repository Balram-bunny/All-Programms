package com.zaky.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.healthcare.pageobject.landingpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc {
	@Test
	public void m1()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://zakystaging.navyuginfo.com");
		landingpage lg=new landingpage(driver);
		lg.clickonbtn();
	}

}
