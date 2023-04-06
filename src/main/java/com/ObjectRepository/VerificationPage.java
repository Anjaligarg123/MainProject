package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage {
	@FindBy(xpath="//h1[@class='page-head-line']")
	private WebElement verifybtn;

	public WebElement getVerifybtn() {
		return verifybtn;
	}
	
	public VerificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}	
	
	public  String verify(WebDriver driver) {
		String act = verifybtn.getText();
		return act;
		
	}

}
