package testrun;

import java.io.IOException;

import org.testng.annotations.Test;

import page.Startpage;
import utility.utils;

public class Test1st extends utils {

	@Test
	public void startTest() throws IOException {
		Startpage sp = new Startpage(driver);
		sp.clickonbtn();
	}
}
