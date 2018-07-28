package com.voyalla.scripts;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.voylla.generics.Auto_Const;
import com.voylla.generics.BaseTest;
import com.voylla.generics.GenericMethods;
import com.voylla.generics.InputData;
import com.voylla.pageobjects.GoogleSignin;
import com.voylla.pageobjects.HomePagePO;
import com.voylla.pageobjects.LoginPagePO;
import com.voylla.pageobjects.MyAccountPagePO;

public class TC_1 extends BaseTest{
	
	@Test
	public void test(){
		HomePagePO homePagePO=new HomePagePO(driver);
		LoginPagePO loginPagePO=new LoginPagePO(driver);
		GoogleSignin gSignin=new GoogleSignin(driver);
		MyAccountPagePO myAccountPagePO=new MyAccountPagePO(driver);
		
		homePagePO.getEleAccountLnk().click();
		homePagePO.getEleMyAccountLnk().click();
		
		loginPagePO.getEleGoogleLoginBTN().click();
		
		GenericMethods.switchToWindowTitle(driver, "Sign in - Google Accounts");
		String emailID=InputData.getPropertyValue(Auto_Const.INPUTPROPERTIES_PATH, "EMAILID");
		String emailPwd=InputData.getPropertyValue(Auto_Const.INPUTPROPERTIES_PATH, "PASSWORD");
		
		gSignin.getEleGoogleEmailTxtFld().sendKeys(emailID);
		gSignin.getEleGoogleEmlNextBTN().click();
		gSignin.getEleGooglePasswordTxtFld().sendKeys(emailPwd);
		gSignin.getEleGooglePwdNextBTN().click();
		
		GenericMethods.switchToWindowTitle(driver, "Voylla");
		
		GenericMethods.mouseMoveToElement(driver, homePagePO.getEleWomenLnk());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		homePagePO.getEleAccountLnk().click();
		homePagePO.getEleMyAccountLnk().click();
		
		String actualEmail=myAccountPagePO.getEleEmailID().getText();
		
		Assert.assertEquals(actualEmail, emailID);
		GenericMethods.waitTitleContains(driver, "Register or Log");
		
		logger.log(LogStatus.PASS, "This test is passed");
	}
                      
}
