package com.CRM.Vtiger.Contacts;

import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateContactsTesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[contains(@title, 'Cr')]")).click();
		//WebElement element = driver.findElement(By.className("small"));
		//Select dropdown=new Select(element);
		//dropdown.selectByVisibleText("Mr.");
		driver.findElement(By.name("firstname")).sendKeys("BALRAM");
		driver.findElement(By.name("lastname")).sendKeys("NAYAK");
		driver.findElement(By.name("button")).click();
		WebElement element = driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.gif']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.linkText("Sign Out")).click();

}
}
