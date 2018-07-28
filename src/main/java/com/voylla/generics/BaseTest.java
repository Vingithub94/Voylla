package com.voylla.generics;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
	
	public ExtentReports reports;
	public ExtentTest logger;
	
	/**
	 * this is about the init method
	 * @throws Exception 
	 */
	@BeforeClass
	public void init() throws Exception
	{
		DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	    String USERNAME="vinayakpatil39";
	    String ACCESS_KEY="fba2ee6e-cc71-4ab6-b163-3c19c60716d4";
	    String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
		WebDriver driver=new RemoteWebDriver(new java.net.URL(URL), caps);
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.voylla.com/");
		
		reports=new ExtentReports(Auto_Const.REPORTS_PATH+"\\report1.html");
		logger=reports.startTest("First Test");
		
		
		
		
	}
	
	@AfterClass
	public void exit()
	{
		
		reports.flush();
//		reports.close();
		driver.quit();
		
	}
}
