package loginfunctionality;

import org.openqa.selenium.By;

import utility.Zakyutility;

public class ZakyLogin extends Zakyutility {
	public void userlogin()
	{
	
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("email")).sendKeys("balram.nayak+99@navyuginfo.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.linkText("Sign in")).click();
	}
 
}
