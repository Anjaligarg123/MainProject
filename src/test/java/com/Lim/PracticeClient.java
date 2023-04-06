package com.Lim;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.AddClientPage;
import com.ObjectRepository.ClientInformationPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeClient {

	public static void main(String[] args) throws Throwable {
		DatabaseUtility	DBLib=new DatabaseUtility();
		 ExcelUtility ExLib=new ExcelUtility();
		 FileUtility FileLib=new FileUtility();
		 JavaUtility JaLib=new JavaUtility();
		 WebDriverUtility webLib=new  WebDriverUtility();
		  String URL=FileLib.readDataFromPropertyFile("url");
		  String USERNAME=FileLib.readDataFromPropertyFile("username");
		  String PASSWARD=FileLib.readDataFromPropertyFile("passward");
		//FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.properties");
		//Properties p=new Properties();
		//  p.load(fis);
		// String URL=p.getProperty("url");
		// String USERNAME=p.getProperty("username");
		// String PASSWARD=p.getProperty("passward");
		 
		// FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\file.xlsx");
			//Workbook wb=WorkbookFactory.create(fi);
			//Sheet sh=wb.getSheet("createclient");
		
		WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		webLib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		driver.get(URL);
		webLib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		l.login(USERNAME, PASSWARD);
		
		//driver.findElement(By.name("username")).sendKeys(USERNAME);
		//driver.findElement(By.name("password")).sendKeys(PASSWARD);
		//driver.findElement(By.xpath("//button[text()='login']")).click();
		JaLib.random();
		//Random ran=new Random();
		//int rannum=ran.nextInt(500);
		HomePage h=new HomePage(driver);
		h.client();
		//driver.findElement(By.xpath("//a[@href='client.php']")).click();
		ClientInformationPage ci=new  ClientInformationPage(driver);
		ci.addclientbtn();
		//driver.findElement(By.linkText("Add Client")).click();
		Thread.sleep(2000);
		AddClientPage ac=new  AddClientPage(driver);
		ac.addclient(driver, ExLib);
		//HashMap<String, String> map = ExLib.readMultipleData("createclient");
		//HashMap<String,String> map=new HashMap<String,String>();
		//for(int i=0;i<=sh.getLastRowNum();i++) {
		//	String key=sh.getRow(i).getCell(0).getStringCellValue();
		//	String value=sh.getRow(i).getCell(1).getStringCellValue();
		//	map.put(key, value);
		//}
		//for(Entry<String, String> set:map.entrySet()) {
		//	driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		//}
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		String exp="INSERT CLIENT";
		String act = driver.findElement(By.xpath("//h1[@class='page-head-line']")).getText();
		if(act.contains(exp)) {
			System.out.println("client is added");
		}
		else {
			System.out.println("client is not added");
		}

	}
}


