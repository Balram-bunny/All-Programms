package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotationattribute {

	@Test(dependsOnMethods = {"testcase2"})
	public void testcase1()
	{
		System.out.println("Mobile login testcase");
	}
	@Test(description="This is test case2")
	public void testcase2()
	{
		System.out.println("Web login testcase");
		Assert.assertTrue(false);
	}
	@Test(description="This is test case3")
	public void testcase3()
	{
		System.out.println("API login testcase");
	}
}
