package com.voylla.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.voylla.generics.BasePage;

public class MyAccountPagePO extends BasePage{

	public MyAccountPagePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Email']/..//div[2]")
	private WebElement eleEmailID;
	
	public WebElement getEleEmailID()
	{
		return eleEmailID;
	}
	

}
