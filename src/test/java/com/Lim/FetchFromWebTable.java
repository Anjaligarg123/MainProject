package com.Lim;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchFromWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		Thread.sleep(2000);
     List<WebElement> num = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	
	 List<WebElement> team = driver.findElements(By.xpath("//tbody/tr/td[2]"));
 List<WebElement> match = driver.findElements(By.xpath("//tbody/tr/td[3]"));	
 List<WebElement> points = driver.findElements(By.xpath("//tbody/tr/td[4]"));
 List<WebElement> rating = driver.findElements(By.xpath("//tbody/tr/td[5]"));
	for(int i=1;i<=team.size();i++) {
		System.out.println(num.get(i).getText()+" "+team.get(i).getText()+" "+match.get(i).getText()+" "+points.get(i).getText()+" "+rating.get(i).getText());
	}
		

	}

}
