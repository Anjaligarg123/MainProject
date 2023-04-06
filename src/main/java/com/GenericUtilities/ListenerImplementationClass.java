package com.GenericUtilities;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		//execution starts from here 
		 String MethodName=result.getMethod().getMethodName();
		 test=report.createTest(MethodName);
		 Reporter.log(MethodName+"------>testscript execution started");
	}

	public void onTestSuccess(ITestResult result) {
		 String MethodName=result.getMethod().getMethodName();
		 test.log(Status.PASS,MethodName+"----->passed" ); 
		 Reporter.log(MethodName+"----->Testscript executio successfull");
		
	}

	public void onTestFailure(ITestResult result) {
//		String FScript=result.getMethod().getMethodName();
//		String FS=FScript+new JavaUtility().getSystemDate();
//		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.sdriver);
//		File src= edriver.getScreenshotAs(OutputType.FILE);
//		File dst=new File("./Screenshot/"+FS+".png");
//		try {
//		FileUtils.copyFile(src,dst);
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
		String screenshotname=WebDriverUtility.getScreenShot(BaseClass.sdriver,result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(screenshotname);
		}
  	catch (Throwable e) {
			e.printStackTrace();
		}
		test.log(Status.FAIL,result.getThrowable());
		Reporter.log("testscript execution failed");
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP,MethodName+"------>Skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log("testscript execution skipped");
		
	}

	public void onStart(ITestContext context) {
		// create html report
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("Lim-project");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("AEGON LIFE");
		report= new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base_Browser","chrome");
		report.setSystemInfo("os","Windows");
		report.setSystemInfo("Base_URL","https://localhost:3306");
	    	report.setSystemInfo("Reporter Name","anjali garg");
		
		
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
