package com.ObjectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;

public class AddPaymentPage {

	@FindBy(name="client_id")
	private WebElement id;
	
	@FindBy(name="month")
	private WebElement mn;
	
	@FindBy(name="amount")
	private WebElement am;
	
	@FindBy(name="due")
	private WebElement due;
	
	@FindBy(name="fine")
	private WebElement fine;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getId() {
		return id;
	}

	public WebElement getMn() {
		return mn;
	}

	public WebElement getAm() {
		return am;
	}

	public WebElement getDue() {
		return due;
	}

	public WebElement getFine() {
		return fine;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public AddPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void addPayment(WebDriver driver,ExcelUtility Exlib) throws Throwable {
		HashMap<String, String> map = Exlib.readMultipleData("addpayment");
		for(Entry<String, String> set:map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	}
		submit.click();
	}
}
