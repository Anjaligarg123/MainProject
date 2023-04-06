package com.Lim;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationScriptTest {
	@BeforeSuite
	public void databaseconnection()
	{
		System.out.println("connect the database");
	}
	@AfterSuite
	public void disconnectdatabase()
	{
		System.out.println("disconnect the database");
	}
	@BeforeClass
	public void openbrowser()
	{
		System.out.println("open the browser");
	}
	@AfterClass
	public void closebrowser()
	{
		System.out.println("close the browser");
	}
	@BeforeMethod
	public void login1()
	{
		System.out.println("login the application");
	}
	@AfterMethod
	public void login()
	{
		System.out.println("logout the application");
	}
	@Test
	public void create() {
		System.out.println("create");	
	}
			
	}

