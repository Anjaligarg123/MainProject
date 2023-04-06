package com.ObjectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;

public class AddnomineePage {
	@FindBy(name="client_id")
	private WebElement cid;
	
	@FindBy(name="name")
	private WebElement noname;
	
	@FindBy(name="sex")
	private WebElement gender ;
	
	@FindBy(name="birth_date")
	private WebElement birthdate;
	
	@FindBy(name="nid")
	private WebElement nomineeid;
	
	@FindBy(name="relationship")
	private WebElement relation;
	
	@FindBy(name="priority")
	private WebElement prior;
	
	@FindBy(name="phone")
	private WebElement phoneno;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	

	public WebElement getCid() {
		return cid;
	}

	public WebElement getNoname() {
		return noname;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getBirthdate() {
		return birthdate;
	}

	public WebElement getNomineeid() {
		return nomineeid;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getPrior() {
		return prior;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}
	
	public WebElement getSubmit() {
		return submit;
	}

	public  AddnomineePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void addnominee(WebDriver driver,ExcelUtility Exlib) throws Throwable {
		HashMap<String, String> map = Exlib.readMultipleData("createnominee");
		for(Entry<String, String> set:map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	}
		submit.click();
	}
	
	

}
