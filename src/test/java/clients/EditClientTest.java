package clients;

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
import com.ObjectRepository.ClientInformationPage;
import com.ObjectRepository.EditClientPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;
import com.ObjectRepository.VerificationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditClientTest extends BaseClass
{

	@Test
	public void editclient(){
		//DatabaseUtility	DBLib=new DatabaseUtility();
		// ExcelUtility ExLib=new ExcelUtility();
		// FileUtility FileLib=new FileUtility();
		// JavaUtility JaLib=new JavaUtility();
		// WebDriverUtility webLib=new  WebDriverUtility();
		//  String URL=FileLib.readDataFromPropertyFile("url");
		 // String USERNAME=FileLib.readDataFromPropertyFile("username");
		 // String PASSWARD=FileLib.readDataFromPropertyFile("passward");
		// WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//webLib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		//driver.get(URL);
		//webLib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//LoginPage l=new LoginPage(driver);
		//l.login(USERNAME, PASSWARD);
		//driver.findElement(By.name("username")).sendKeys(USERNAME);
		//driver.findElement(By.name("password")).sendKeys(PASSWARD);
		//driver.findElement(By.xpath("//button[text()='login']")).click();
		HomePage h=new HomePage(driver);
		h.client();
		//driver.findElement(By.xpath("//a[@href='client.php']")).click();
		ClientInformationPage ci=new ClientInformationPage(driver);
		ci.editbutton(driver,"1679644281");
		//driver.findElement(By.xpath("(//a[contains(@href,'editClient')])[728]")).click();
		EditClientPage ed=new EditClientPage(driver);
		ed.address("super");
		//driver.findElement(By.name("address")).sendKeys("stand bus");
		ed.submit();
		//driver.findElement(By.name("submit")).click();
		String exp="UPDATE CLIENT";
		VerificationPage vp=new VerificationPage(driver);
		String s=vp.verify(driver);
		//String act = driver.findElement(By.xpath("//h1[@class='page-head-line']")).getText();
		if(s.contains(exp)) {
			System.out.println("client is update");
		}
		else {
			System.out.println("client is not updated");
		}

	}

}
