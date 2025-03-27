package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.utils;

public class Startpage extends utils {

	WebDriver driver;
	@FindBy(xpath = "//*[text()='Sign In]")
	WebElement signin;

	public Startpage(WebDriver driver)throws IOException {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonbtn() {
		signin.click();
	}
}
