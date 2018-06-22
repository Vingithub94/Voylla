package com.voylla.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voylla.generics.BasePage;

public class GoogleSignin extends BasePage{

	public GoogleSignin(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identifierId")
	private WebElement eleGoogleEmailTxtFld;
	
	public WebElement getEleGoogleEmailTxtFld()
	{
		return eleGoogleEmailTxtFld;
	}
	
	@FindBy(id="identifierNext")
	private WebElement eleGoogleEmlNextBTN;
	
	public WebElement getEleGoogleEmlNextBTN()
	{
		return eleGoogleEmlNextBTN;
	}
	
	@FindBy(name="password")
	private WebElement eleGooglePasswordTxtFld;
	
	public WebElement getEleGooglePasswordTxtFld()
	{
		return eleGooglePasswordTxtFld;
	}
	
	@FindBy(id="passwordNext")
	private WebElement eleGooglePwdNextBTN;
	
	public WebElement getEleGooglePwdNextBTN()
	{
		return eleGooglePwdNextBTN;
	}

}
