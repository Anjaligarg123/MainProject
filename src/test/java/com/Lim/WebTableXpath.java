package com.Lim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/player-rankings/test/batting");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 String text = driver.findElement(By.xpath("//table//tbody//a[text()='Keegan Petersen']/../../td[4]")).getText();
		System.out.println(text);

	}
}
