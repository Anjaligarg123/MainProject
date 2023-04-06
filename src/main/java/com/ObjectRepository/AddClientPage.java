package com.ObjectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtilities.ExcelUtility;

public class AddClientPage {
	@FindBy(xpath="//a[text()='Delete Client']")
	private WebElement deleteclient;
	
	@FindBy(name="client_password")
	private WebElement cpwd;
	
	@FindBy(name="name")
	private WebElement name1;
	
	@FindBy(name="fileToUpload")
	private WebElement fupload;
	
	@FindBy(name="sex")
	private WebElement sex;
	
	@FindBy(name="birth_date")
	private WebElement bdate;
	
	@FindBy(name="maritial_status")
	private WebElement mstatus;
	
	@FindBy(name="nid")
	private WebElement in;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="address")
	private WebElement add;
	
	@FindBy(name="policy_id")
	private WebElement pid;
	
	@FindBy(name="nominee_name")
	private WebElement noname1;
	
	@FindBy(name="nominee_sex")
	private WebElement nsex;
	
	@FindBy(name="nominee_birth_date")
	private WebElement nbirthdate;
	
	
	@FindBy(name="nominee_nid")
	private WebElement nnid1;
	
	@FindBy(name="nominee_relationship")
	private WebElement nrelation;
	
	@FindBy(name="priority")
	private WebElement npriority;
	
	@FindBy(name="nominee_phone")
	private WebElement nphone;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public AddClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}	
	
	public WebElement getCpwd() {
		return cpwd;
	}

	public WebElement getName1() {
		return name1;
	}

	public WebElement getFupload() {
		return fupload;
	}

	public WebElement getSex() {
		return sex;
	}

	public WebElement getBdate() {
		return bdate;
	}

	public WebElement getMstatus() {
		return mstatus;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getPid() {
		return pid;
	}

	public WebElement getNoname1() {
		return noname1;
	}

	public WebElement getNsex() {
		return nsex;
	}

	public WebElement getNbirthdate() {
		return nbirthdate;
	}

	public WebElement getNnid1() {
		return nnid1;
	}

	public WebElement getNrelation() {
		return nrelation;
	}

	public WebElement getNpriority() {
		return npriority;
	}

	public WebElement getNphone() {
		return nphone;
	}

	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getDeleteclient() {
		return deleteclient;
	}
	public void declient() {
		deleteclient.click();
	}
	
	public void addclient(WebDriver driver,ExcelUtility Exlib) throws Throwable {
		HashMap<String, String> map = Exlib.readMultipleData("createclient");
		for(Entry<String, String> set:map.entrySet()) {
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
	}
		submit.click();
	}

}
