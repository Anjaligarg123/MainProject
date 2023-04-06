package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(name="username")
	private WebElement untext;
	
	@FindBy(name="password")
	private WebElement pwdtext;
	
	@FindBy(xpath="//button[text()='login']")
	private WebElement lgbtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		//utilization
	}

	public WebElement getUntext() {
		return untext;
	} 


	public WebElement getPwdtext() {
		return pwdtext;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
	//Business libaray
public void login(String USERNAME,String PASSWARD) {
	untext.sendKeys(USERNAME);
	pwdtext.sendKeys(PASSWARD);
	lgbtn.click();
	
	
}

	}
	
 