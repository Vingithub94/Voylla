package com.voylla.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.ChromeDriverManager;

/**
 * 
 * @author Vinayak
 * 
 * <br>this is the description about the class
 *
 */
public class BaseTest {
	
	public WebDriver driver;
	/**
	 * this is about the init method
	 */
	@BeforeClass
	public void init()
	{
		ChromeDriverManager.getInstance().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.voylla.com/");
	}
	
	@AfterClass
	public void exit()
	{
		driver.quit();
	}
}
