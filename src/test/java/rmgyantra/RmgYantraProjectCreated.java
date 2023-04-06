package rmgyantra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraProjectCreated {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		String expProj="lim32";
		try {
		WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://rmgtestingserver:8084/");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.findElement(By.name("username")).sendKeys("rmgyantra");
       driver.findElement(By.name("password")).sendKeys("rmgy@9999");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       driver.findElement(By.xpath("//a[text()='Projects']")).click();
       driver.findElement(By.xpath("//span[text()='Create Project']")).click();
       driver.findElement(By.name("projectName")).sendKeys("lim32");
       driver.findElement(By.name("createdBy")).sendKeys("Anjali garg");
      WebElement listBox = driver.findElement(By.name("status"));
       Select s=new Select(listBox);
        s.selectByIndex(1);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
			// 1.Register the database
		Driver driver1 =new Driver();
		DriverManager.registerDriver(driver1);
		//2.get connection for the database
		 con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");	
		//3. create statement
		 Statement state=con.createStatement();
		 String query="select * from project;";
		//4.execute query/update
		 ResultSet result=state.executeQuery(query);
		 boolean flag=false;
		 while(result.next()) {
			 String actProj=result.getString(4);
			 System.out.println(actProj);
			 if(actProj.equalsIgnoreCase(expProj))
			 {
				 flag=true;
				 break;
			 }
		 }
		 if(flag)
		 {
			 System.out.println("project is created");
		 }
		 else {
			 System.out.println("project is not created");
		 }
	}
	catch (Exception e) {
		
	}
		finally {
			//5.close the database connection
			con.close();
		}
        
        
	}

}
