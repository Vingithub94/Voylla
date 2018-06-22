package com.voylla.generics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericMethods {

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
}
