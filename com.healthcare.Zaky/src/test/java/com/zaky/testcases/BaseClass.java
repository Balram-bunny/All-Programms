package com.zaky.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.zaky.utility.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	Readconfig ut = new Readconfig();
	String url = ut.getbaseurl();
	String browser = ut.getbrowser();

	public static WebDriver driver;

	@BeforeClass
	public void setup() {

		switch (browser.toLowerCase()) {
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://zakystaging.navyuginfo.com/");

	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}
}
