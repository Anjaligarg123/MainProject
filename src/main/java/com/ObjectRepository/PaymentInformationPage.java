package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage {
	@FindBy(xpath="//a[text()='Add Payment']")
	private WebElement addpayment;
	
	public PaymentInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public WebElement getAddpayment() {
		return addpayment;
	}

	public void Addpaymentbtn() {
		addpayment.click();
	}

}
