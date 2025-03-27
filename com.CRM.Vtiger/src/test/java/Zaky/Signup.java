package Zaky;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zakystaging.navyuginfo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[@role='button'][position()=1]")).click();
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("g22@yopmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test@123");
            driver.findElement(By.cssSelector("input[type='checkbox']")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();

	}

}
