package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditClientPage {
@FindBy(name="address")
private WebElement editadd;

@FindBy(name="client_id")
private WebElement editClientid;

@FindBy(name="client_password")
private WebElement editClientpassward;

@FindBy(name="name")
private WebElement editname;

@FindBy(name="submit")
private WebElement submitbtn;

public EditClientPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

public WebElement getEditClientid() {
	return editClientid;
}

public WebElement getEditClientpassward() {
	return editClientpassward;
}

public WebElement getEditname() {
	return editname;
}

public WebElement getSubmitbtn() {
	return submitbtn;
}


public WebElement getEditadd() {
	return editadd;
}

public void address(String add) {
	editadd.clear();
	editadd.sendKeys(add);
}
public void submit() {
	submitbtn.click();
}
public void editClientPassward(String pwd) {
	editClientpassward.clear();
	editClientpassward.sendKeys(pwd);
}

public void editName(String editName) {
	editname.clear();
	editname.sendKeys(editName);
}
public void editClientId(String editid ) {
	editClientid.clear();
	editClientid.sendKeys(editid);
	
}
}