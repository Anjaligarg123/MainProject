package clients;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateClientTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.properties");
		Properties p=new Properties();
		  p.load(fis);
		 String URL=p.getProperty("url");
		 String USERNAME=p.getProperty("username");
		 String PASSWARD=p.getProperty("passward");
		 
		 FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\file.xlsx");
			Workbook wb=WorkbookFactory.create(fi);
			Sheet sh=wb.getSheet("createclient");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWARD);
		driver.findElement(By.xpath("//button[text()='login']")).click();
		Random ran=new Random();
		int rannum=ran.nextInt(500);
		driver.findElement(By.xpath("//a[@href='client.php']")).click();
		driver.findElement(By.linkText("Add Client")).click();
		HashMap<String,String> map=new HashMap<String,String>();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		for(Entry<String, String> set:map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
		//driver.findElement(By.name("client_password")).sendKeys("12345");
		//driver.findElement(By.name("name")).sendKeys("Gayatri"+rannum);
		//driver.findElement(By.name("fileToUpload")).sendKeys("C:\\Users\\pooja\\Downloads\\pexels-miguel-á-padriñán-255379.jpg");
		//driver.findElement(By.name("sex")).sendKeys("Female");
		//driver.findElement(By.name("birth_date")).sendKeys("10/05/2023");
		//driver.findElement(By.name("maritial_status")).sendKeys("unmarried");
		//driver.findElement(By.name("nid")).sendKeys("777");
		//driver.findElement(By.name("phone")).sendKeys("9876543210");
		//driver.findElement(By.name("address")).sendKeys("Bus stand");
		//driver.findElement(By.name("policy_id")).sendKeys("22");
		//driver.findElement(By.name("nominee_name")).sendKeys("raju");
		//driver.findElement(By.name("nominee_sex")).sendKeys("male");
		//driver.findElement(By.name("nominee_birth_date")).sendKeys("12/02/1995");
		//driver.findElement(By.name("nominee_nid")).sendKeys("888");
		//driver.findElement(By.name("nominee_relationship")).sendKeys("friend");
		//driver.findElement(By.name("priority")).sendKeys("1");
		//driver.findElement(By.name("nominee_phone")).sendKeys("2345678912");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
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
