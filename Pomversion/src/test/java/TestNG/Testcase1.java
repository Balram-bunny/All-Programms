package TestNG;

import org.testng.annotations.*;

public class Testcase1 {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void afteresuite()
	{
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test...");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test...");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	@Test
	public void test1()
	{
		System.out.println("this is test case1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test case2");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}

}
