package com.sunseed.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerclass implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configReport()
	{
		String timestamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName="Agrisunseedreport-"+timestamp+".html";
		htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//"+reportName);
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system information
		reports.setSystemInfo("Machine","testpc1" );
		reports.setSystemInfo("OS","windows10" );
		reports.setSystemInfo("browser","chrome" );
		reports.setSystemInfo("User","Balram" );
		
		//configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("Extent Listener Report");
		htmlReporter.config().setReportName("This is my first report");
		htmlReporter.config().setTheme(Theme.DARK);
		

		
	}
	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		configReport();
		System.out.println("On start method invoked..."+ result.getName());

	}

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("On finish method invoked..."+ result.getName());
		reports.flush();// It is mandatory to call flush method to ensure information is written to the started 

	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test start method invoked..."+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of testmethod passed..."+ result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is:"+result.getName(), ExtentColor.GREEN));


	}

	// This method will invoked when test case got failed.
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of testmethod failed..."+ result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is:"+result.getName(), ExtentColor.RED));
		
		// Add screenshots to report
		String screenShotPath=System.getProperty("user.dir")+"\\Screenshots\\"+ result.getName() +".png";
		File screenShotFile= new File (screenShotPath);
		
		if(screenShotFile.exists())
		{
			test.fail("Captured screenshot is below:"+ test.addScreenCaptureFromPath(screenShotPath));
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Name of testmethod skippped..."+ result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skipped test case is:"+result.getName(), ExtentColor.YELLOW));


	}

	
	

}
