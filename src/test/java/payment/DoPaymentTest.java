package payment;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.AddPaymentPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.PaymentInformationPage;
import com.ObjectRepository.VerificationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoPaymentTest extends BaseClass {

	@Test(groups="regression")
	public void dopayment() throws Throwable{
		//DatabaseUtility	DBLib=new DatabaseUtility();
		// ExcelUtility ExLib=new ExcelUtility();
		// FileUtility FileLib=new FileUtility();
		// JavaUtility JaLib=new JavaUtility();
		 //WebDriverUtility webLib=new  WebDriverUtility();
		//  String URL=FileLib.readDataFromPropertyFile("url");
		 // String USERNAME=FileLib.readDataFromPropertyFile("username");
		 // String PASSWARD=FileLib.readDataFromPropertyFile("passward");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//webLib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		//driver.get(URL);
		//webLib.waitForPageLoad(driver);
		//LoginPage l=new LoginPage(driver);
		//l.login(USERNAME,PASSWARD);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.name("username")).sendKeys(USERNAME);
		//driver.findElement(By.name("password")).sendKeys(PASSWARD);
		//driver.findElement(By.xpath("//button[text()='login']")).click();
		HomePage h=new HomePage(driver);
		h.payment();
		//driver.findElement(By.xpath("//a[@href='payment.php']")).click();
		PaymentInformationPage pi=new  PaymentInformationPage(driver);
		pi.Addpaymentbtn();
		AddPaymentPage ap=new AddPaymentPage(driver);
		ap.addPayment(driver, ExLib);
		//driver.findElement(By.xpath("//a[text()='Add Payment']")).click();
		//HashMap<String, String> map = ExLib.readMultipleData("addpayment");
		//for(Entry<String, String> set:map.entrySet()) {
		//	driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		//}
		
		
		//driver.findElement(By.name("client_id")).sendKeys("1678780173");
		//driver.findElement(By.name("month")).sendKeys("jun");
		//driver.findElement(By.name("amount")).sendKeys("2000");
		//driver.findElement(By.name("due")).sendKeys("0");
		//driver.findElement(By.name("fine")).sendKeys("250");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		String exp="INSERT PAYMENT";
		VerificationPage vp=new VerificationPage(driver);
		String s=vp.verify(driver);
		//String act = driver.findElement(By.xpath("//h1[@class='page-head-line']")).getText();
		if( s.contains(exp)) {
			System.out.println("payment is inserted");
		}
		else {
			System.out.println("payment is not inserted");
		}

       
        

	}
}

