package com.sunseed.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver ldriver;
	public SignIn(WebDriver rdriver )
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// find element
	@FindBy (name="email")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement submitbtn;
	
	@FindBy (xpath="//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk']//*[name()='svg']")
	WebElement carausalicon;
	
	@FindBy (xpath="//input[@placeholder='Enter Name']")
	WebElement projectname;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy (xpath="//button[text()='Cancel']")
	WebElement cancel;
	
	//perform action
	public void enterusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonsubmit()
	{
		submitbtn.click();
	}
	public void clickonicon()
	{
		carausalicon.click();
	}
	public void enterprojectname(String pname)
	{
		projectname.sendKeys(pname);
	}
	public void clickoncreaterun()
	{
		submit.click();
	}
	public void Cancel()
	{
		cancel.click();
	}
	

}
