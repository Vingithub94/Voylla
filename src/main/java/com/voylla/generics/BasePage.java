package com.voylla.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='CART']/../..//div[4]")
	private WebElement eleAccountLnk;
	
	public WebElement getEleAccountLnk()
	{
		return eleAccountLnk;
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement eleMyAccountLnk;
	
	public WebElement getEleMyAccountLnk()
	{
		return eleMyAccountLnk;
	}
	
	@FindBy(xpath="//a[@data-gender='Women']")
	private WebElement eleWomenLnk;
	
	public WebElement getEleWomenLnk()
	{
		return eleWomenLnk;
	}
	
}
