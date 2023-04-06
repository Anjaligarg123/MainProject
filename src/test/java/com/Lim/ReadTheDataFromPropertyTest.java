package com.Lim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadTheDataFromPropertyTest {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.properties");
		Properties p=new Properties();
		p.load(fis);
		 String BROWSER=p.getProperty("browser");
		 String URL=p.getProperty("url");
		 String USERNAME=p.getProperty("username");
		 String PASSWARD=p.getProperty("passward");
		 System.out.println(BROWSER);
		 System.err.println( URL);
		 System.out.println( USERNAME);
		 System.out.println( PASSWARD);
		


	}

}
