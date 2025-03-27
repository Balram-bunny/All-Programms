package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Session1 {
  WebDriver driver;
	@Test
	public void SignIn() {
		driver=new EdgeDriver();

       driver.get("https://www.google.com/");
       String Actual=driver.getTitle();
       String Expected="Google";
       Assert.assertEquals(Actual, Expected);
	}
//	@BeforeTest
//	public void startbrowser()
//	{
//		driver=new EdgeDriver();
//	}
//	@AfterTest
//	public void teardown()
//	{
//		driver.close();
//	}

}
