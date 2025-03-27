package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utils {

	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void lunch() throws IOException {
//		 try {
//	         browser = readprop("Browser");
//	     } catch (IOException e) {
//	         e.printStackTrace();
//	     }
		 String browser = readprop("Browser");
		 String url = readprop("Url");
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("InPrivate");
			driver = new EdgeDriver(options);
			break;
		}
		 try {
	         url = readprop("Url");
	     } catch (IOException e) {
	         e.printStackTrace();
	     }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@AfterTest
	public void teardown() {
		//driver.close();
	}

	public String readprop(String element) throws IOException  {
		
		FileInputStream fis = new FileInputStream(".\\resource\\config.properties"); 
        Properties props=new Properties(); 
        try {
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        fis.close();
       return props.getProperty(element);
	}

}
