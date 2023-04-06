package com.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
public  DatabaseUtility	DBLib=new DatabaseUtility();
public 	ExcelUtility ExLib=new ExcelUtility();
public 	 FileUtility FileLib=new FileUtility();
public  WebDriverUtility webLib=new  WebDriverUtility();
public  static WebDriver sdriver;
	
	
	@BeforeSuite(alwaysRun = true)
	public void configBS() throws Throwable
	{
		DBLib.connectTODb();
		System.out.println("-----connect to database-----");
		
	}
   // @Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable
	{
	String BROWSER=FileLib.readDataFromPropertyFile("browser");
	String URL=FileLib.readDataFromPropertyFile("url");
	if(BROWSER.equalsIgnoreCase("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
			}
	 else if(BROWSER.equalsIgnoreCase("edge"))
	    {
       WebDriverManager.edgedriver().setup();
       driver=new EdgeDriver();
	    }
	 else {
		 System.out.println("invalid browser");
		
	 }
	sdriver=driver;
	 webLib.maximizeWindow(driver);
	driver. get(URL);
	webLib.waitForPageLoad(driver);
	}
	     

	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable   {
	String USERNAME=	FileLib.readDataFromPropertyFile("username");
	String PASSWARD=	FileLib.readDataFromPropertyFile("passward");
	LoginPage lp=new LoginPage(driver);
	lp.login(USERNAME, PASSWARD);
	}
	@AfterMethod(alwaysRun = true)
	public void configAM() {
		HomePage h=new HomePage(driver);
		h.logouticon();
	}
	@AfterClass(alwaysRun = true)
	public void congigAC() {
		driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void configAS() throws Throwable {
		DBLib.closeDB();
	}

}
