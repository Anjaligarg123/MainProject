package nominee;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.AddnomineePage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.NomineeInformationPage;
import com.ObjectRepository.VerificationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNomineeTest extends BaseClass {

	@Test(groups="smoke")
	public void createnominee() throws Throwable{
		//DatabaseUtility	DBLib=new DatabaseUtility();
		// ExcelUtility ExLib=new ExcelUtility();
		// FileUtility FileLib=new FileUtility();
		// JavaUtility JaLib=new JavaUtility();
		// WebDriverUtility webLib=new  WebDriverUtility();
		 // String URL=FileLib.readDataFromPropertyFile("url");
		 // String USERNAME=FileLib.readDataFromPropertyFile("username");
		 // String PASSWARD=FileLib.readDataFromPropertyFile("passward");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//webLib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		//driver.get(URL);
		//webLib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//LoginPage l=new LoginPage(driver);
	   //  l.login(USERNAME, PASSWARD);
		//driver.findElement(By.name("username")).sendKeys(USERNAME);
		//driver.findElement(By.name("password")).sendKeys(PASSWARD);
		//driver.findElement(By.xpath("//button[text()='login']")).click();
		HomePage h= new HomePage(driver);
		h.nominee();
		//driver.findElement(By.xpath("//a[@href='nominee.php']")).click();
		NomineeInformationPage ni= new NomineeInformationPage(driver);
		ni.addnomineebtn();
		//driver.findElement(By.linkText("Add Nominee")).click();
		AddnomineePage an=new  AddnomineePage(driver);
		an.addnominee(driver, ExLib);
		//HashMap<String, String> map = ExLib.readMultipleData("createnominee");
		//for(Entry<String, String> set:map.entrySet()) {
		//	driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		//}
		
		//driver.findElement(By.name("client_id")).sendKeys("1678780173");
		//driver.findElement(By.name("name")).sendKeys("Shyam");
		//driver.findElement(By.name("sex")).sendKeys("male");
		//driver.findElement(By.name("birth_date")).sendKeys("10/09/2022");
		//driver.findElement(By.name("nid")).sendKeys("888");
		//driver.findElement(By.name("relationship")).sendKeys("uncle");
		//driver.findElement(By.name("priority")).sendKeys("1");
		//driver.findElement(By.name("phone")).sendKeys("8542175412");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		String exp="INSERT NOMINEE";
		VerificationPage vp=new VerificationPage(driver);
	     String	s=vp.verify(driver);
		//String act = driver.findElement(By.xpath("//h1[@class='page-head-line']")).getText();
		if(s.contains(exp)) {
			System.out.println("nominee is added");
		}
		else {
			System.out.println("nominee is not added");
		}
		

	}

	
}
