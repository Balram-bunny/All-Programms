package TestNG;

import org.testng.annotations.Test;

public class groupattribute {
	@Test(groups="software")
	public void infosys()
	{
		System.out.println("infosys");
	}
	@Test(groups="software")
	public void wipro()
	{
		System.out.println("wipro");
	}
	@Test(groups="automobile")
	public void maruti()
	{
		System.out.println("maruti");
	}
	@Test(groups="automobile")
	public void tata()
	{
		System.out.println("tata");
	}

}
