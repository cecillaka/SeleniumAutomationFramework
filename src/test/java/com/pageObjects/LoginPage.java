package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driverl;
	
 public LoginPage(WebDriver driver){
	
	driverl=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name = "uid")
WebElement userNameInput;

@FindBy(name="password")
WebElement passwordInput;

@FindBy(name = "btnLogin")
WebElement loginBtn;


 public void insertUsername(String UsrName)
 {
	 userNameInput.sendKeys(UsrName); 
 }
 
 public void insertPassword(String password) {
	 passwordInput.sendKeys(password);
 }
 
 public void clickLoginBtn() {
	 loginBtn.click();
 }

}
