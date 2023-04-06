package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineeInformationPage {
	
	@FindBy(xpath="//a[text()='Add Nominee']")
	private WebElement addnominee;
	
	public NomineeInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public WebElement getAddnominee() {
		return addnominee;
	}

	public void addnomineebtn() {
		addnominee.click();
	}

}
