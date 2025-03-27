package com.CRM.Vtiger.Organization;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrganizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int Random = r.nextInt(1000);
		String orgname="TestYantra"+ Random;
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[contains(@title, 'Cr')]")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		String ExpectedOrgName = driver.findElement(By.className("dvHeaderText")).getText();
		
	   if(ExpectedOrgName.contains(orgname))
	   {
		   System.out.println("Pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
		WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	   Actions act= new Actions(driver);
	   act.moveToElement(element).perform();
	   driver.findElement(By.linkText("Sign Out")).click();
	   driver.close();
		

	}

}
