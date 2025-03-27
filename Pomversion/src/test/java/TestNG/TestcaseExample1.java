package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestcaseExample1 {

	@Test
	public void testmethod1()
	{
		System.out.println("This is testmethod1.....");
		Assert.assertTrue(true);
	}
	@Test
	public void testmethod2()
	{
		System.out.println("This is testmethod2.....");
		Assert.assertTrue(false);
	}
	@Test
	public void testmethod3()
	{
		System.out.println("This is testmethod3.....");
		Assert.assertTrue(false);
	}
	@Test
	public void testmethod4()
	{
		System.out.println("This is testmethod4.....");
		Assert.assertTrue(true);
	}
	@Test
	public void testmethod5()
	{
		System.out.println("This is testmethod5.....");
		throw new SkipException("this method is skipped");
		
	}
}
