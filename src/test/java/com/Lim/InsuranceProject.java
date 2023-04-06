package com.Lim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsuranceProject {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("555");
	driver.findElement(By.name("password")).sendKeys("666");
	driver.findElement(By.xpath("//button[text()='login']")).click();

	}

}
