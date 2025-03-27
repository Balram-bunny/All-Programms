package com.sunseed.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.sunseed.pageobject.Preprocessor;

public class Tc_02 extends BaseClass{
	@Test
	public void preprocessor() throws InterruptedException
	{
		Tc_01 sgnin=new Tc_01();
		sgnin.signin();
		
		Preprocessor pr=new Preprocessor(driver);
		Thread.sleep(2000);
		pr.clickonAPV();
		Thread.sleep(2000);
		pr.PVmodule();
		Thread.sleep(2000);
		pr.PVoperation();
		Thread.sleep(2000);
		pr.moduleconfig();
		pr.modulemaskpattern("10");
		pr.tiltangle("15");
		pr.Height("5");
		pr.Lengthonerow("3");
		pr.gapbetweenmodules("4");
		pr.pitchofrows("6");
		pr.azimuth("5");
		
//		pr.PVmodule();
//		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		pr.Savenext();
	}

}
