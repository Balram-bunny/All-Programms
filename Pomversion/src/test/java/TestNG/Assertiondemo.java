package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertiondemo {
	@Test
	public void login()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualresult=driver.getTitle();
		String expected="Online Shopping Site for Mobiless, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		SoftAssert softverify=new SoftAssert();
		softverify.assertEquals(actualresult, expected);
		
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.flipkart.com/");
		softverify.assertAll();

		
	}

}
