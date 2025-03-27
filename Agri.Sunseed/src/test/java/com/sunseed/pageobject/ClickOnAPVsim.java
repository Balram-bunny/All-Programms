package com.sunseed.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnAPVsim {
	WebDriver ldriver;
	public ClickOnAPVsim(WebDriver rdriver )
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// find carousal icoon
	@FindBy (xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']//*[name()='svg']")
	WebElement icon;
	
	public void ClickOnApv()
	{
		icon.click();
	}
}
