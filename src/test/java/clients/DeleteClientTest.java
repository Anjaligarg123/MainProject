package clients;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
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

public class DeleteClientTest extends BaseClass {

	@Test
	public void deleteclient(){
		//DatabaseUtility	DBLib=new DatabaseUtility();
		// ExcelUtility ExLib=new ExcelUtility();
		// FileUtility FileLib=new FileUtility();
		// JavaUtility JaLib=new JavaUtility();
		// WebDriverUtility webLib=new  WebDriverUtility();
		//  String URL=FileLib.readDataFromPropertyFile("url");
		 // String USERNAME=FileLib.readDataFromPropertyFile("username");
		 // String PASSWARD=FileLib.readDataFromPropertyFile("passward");
	   //	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//webLib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		//driver.get(URL);
		//webLib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//LoginPage l=new LoginPage(driver);
	  //   l.login(USERNAME, PASSWARD);
	     HomePage h=new HomePage(driver);
	     h.client();
	     
		
		//driver.findElement(By.xpath("//a[@href='client.php']")).click();
	     ClientInformationPage ci=new  ClientInformationPage(driver);
	     ci.editbutton(driver,"1671253023");
		//driver.findElement(By.xpath("(//a[contains(@href,'editClient')])[728]")).click();
	     
	     AddClientPage cd=new AddClientPage(driver);
	     cd.declient();
		//driver.findElement(By.xpath("//a[text()='Delete Client']")).click();
	     h.client();
		//driver.findElement(By.xpath("//a[@href='nominee.php']")).click();
	  List<WebElement> allid = driver.findElements(By.xpath("//tr/td[1]"));
	  int count=allid.size();
	  String Expid="1671253023";
	  boolean f=false;
	  for(int i=0;i<count;i++)
	  {
		  String actid=allid.get(i).getText();
		  if(actid.contains(Expid)) {
			  System.out.println("client is not deleted");
			  f=true;
		  }
		  
	  }
	  if(!f)
	  {
		  {
			  System.out.println("client is deleted"); 
		  }
	  }
	}

}
