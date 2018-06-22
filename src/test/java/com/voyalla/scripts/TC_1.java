package com.voyalla.scripts;

import javax.net.ssl.HostnameVerifier;

import org.testng.annotations.Test;

import com.voylla.generics.Auto_Const;
import com.voylla.generics.BaseTest;
import com.voylla.generics.GenericMethods;
import com.voylla.generics.InputData;
import com.voylla.pageobjects.GoogleSignin;
import com.voylla.pageobjects.HomePagePO;
import com.voylla.pageobjects.LoginPagePO;

public class TC_1 extends BaseTest{
	
	@Test
	public void test(){
		HomePagePO homePagePO=new HomePagePO(driver);
		LoginPagePO loginPagePO=new LoginPagePO(driver);
		GoogleSignin gSignin=new GoogleSignin(driver);
		
		
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
		
		
		
	}
                      
}
