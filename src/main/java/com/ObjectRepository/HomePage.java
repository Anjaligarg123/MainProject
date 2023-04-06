package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//a[@href='client.php']")
	private WebElement clientmo;
	
	@FindBy(xpath="//a[@href='nominee.php']")
	private WebElement nomineemo;

	@FindBy(xpath="//a[@href='payment.php']")
	private WebElement paymentmo;
	
	@FindBy(xpath="//a[@href='agent.php']")
	private WebElement agentmo;
	
	@FindBy(xpath="//a[@href='policy.php']")
	private WebElement policymo;
	
	@FindBy(name="key")
	private WebElement searchText;
	
	@FindBy(xpath="//input[@class='searchBtn']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[@class='btn btn-danger']")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public WebElement getClient() {
		return clientmo;
	}

	public WebElement getNominee() {
		return nomineemo;
	}

	public WebElement getPayment() {
		return paymentmo;
	}

	public WebElement getAgent() {
		return agentmo;
	}

	public WebElement getPolicy() {
		return policymo;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getLogout() {
		return logout;
	}
 public void client()
 {
	 clientmo.click();
 }
	
 public void nominee()
 {
	 nomineemo.click();
 }
 public void agent()
 {
	 agentmo.click();
 }
 
 public void policy()
 {
	 policymo.click();
 }
 public void payment()
 {
	 paymentmo.click();
 }
 public void search()
 {
	 searchText.sendKeys("raju");
 }
 
 public void searchbutton()
 {
	 searchbtn.click();
	 
 }
 public void logouticon()
 {
	 logout.click();
 }
		
}
