package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser {
  WebDriver driver;
  @BeforeTest
  @Parameters("browser")
	public void launchbrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			break;
		}
		
	}
  @Test
  public void m1()
	{
		driver.get("https://www.google.com/");
		String actual=driver.getTitle();
		String expected="Google";
		Assert.assertEquals(actual, expected);
		
	}
  @AfterMethod
  public void quit()
  {
	  driver.close();
  }
}
