package com.voylla.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voylla.generics.BasePage;

public class LoginPagePO extends BasePage{

	public LoginPagePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="register-tab")
	private WebElement eleRegisterLnk;
	
	public WebElement getEleRegisterLnk()
	{
		return eleRegisterLnk;
	}
	
	@FindBy(className="google-login")
	private WebElement eleGoogleLoginBTN;
	
	public WebElement getEleGoogleLoginBTN()
	{
		return eleGoogleLoginBTN;
	}
	
	
	

}
