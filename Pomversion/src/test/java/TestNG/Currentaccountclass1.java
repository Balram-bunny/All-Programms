package TestNG;

import org.testng.annotations.Test;

public class Currentaccountclass1 {
	@Test(invocationCount=2)
	public void m1()
	{
		System.out.println("test case 1");
	}
	@Test
	public void m2()
	{
		System.out.println("test case 2");
	}

}
