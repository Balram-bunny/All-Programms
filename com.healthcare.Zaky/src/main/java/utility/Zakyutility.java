package utility;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.App;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zakyutility {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchbrowser()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://zakystaging.navyuginfo.com/");
		 
		 
	 }
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
	public  static void readloginprop()
	{
		Properties prop = new Properties();
		try {
		    //load a properties file from class path, inside static method
		    prop.load(App.class.getClassLoader().getResourceAsStream("login.properties"));

		    //get the property value and print it out
		    System.out.println(prop.getProperty("database"));
		    System.out.println(prop.getProperty("dbuser"));
		    System.out.println(prop.getProperty("dbpassword"));

		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
	}
}
