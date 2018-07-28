package com.voylla.generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {

	public static WebDriverWait wait;
	
	public static void switchToWindowTitle(WebDriver driver, String expectedTitle)
	{
		Set<String> handles = driver.getWindowHandles();
		String actualTitle=null;
		
		first:
		for(String handle: handles)
		{
			driver.switchTo().window(handle);
			actualTitle=driver.getTitle();
			if(actualTitle.contains(expectedTitle))
			{
				break first;
			}
		}
	}
	
	public static void mouseMoveToElement(WebDriver driver, WebElement element)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static void waitTitleContains(WebDriver driver, String title)
	{
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(title));
	}
}
