package com.voylla.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.voylla.generics.BasePage;

public class HomePagePO extends BasePage{

	public HomePagePO(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	

}
