package com.healthcare.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
   WebDriver ldriver;
   
   public landingpage(WebDriver rdriver)
   {
	  ldriver = rdriver;
	   PageFactory.initElements(rdriver, this);
   }
   
   //locate and find
   @FindBy (linkText="Sign In")
   WebElement signin;
   
   public void clickonbtn()
   {
	   signin.click();
   }
}
