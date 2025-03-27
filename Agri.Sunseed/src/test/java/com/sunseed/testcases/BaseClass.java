package com.sunseed.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sunseed.utility.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Readconfig ut=new Readconfig();
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
// for implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// for logging

	}

	
	public void capturescreenshot(WebDriver  driver, String testName) throws IOException
	{
		//Step1 : convert webdriver object to Takesscreenshot interface
		TakesScreenshot screenshot= ((TakesScreenshot)driver);
		// Step2 : call getscreenshotAs method to create image file
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+testName+".png");
		// Step3 : copy image file to destination
		FileUtils.copyFile(src, dest);
		
	}
	
	
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//
//	}
}
