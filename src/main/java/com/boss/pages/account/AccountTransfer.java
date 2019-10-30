package com.boss.pages.account;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.AppsCommon;
import com.boss.framework.utils.Constant;
import com.boss.framework.utils.DriverFactory;

public class AccountTransfer extends LoadableComponent<AccountTransfer> {
	//PageObjects 
	
    public AccountTransfer() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
    }
	
    public static void GoToAppURL(String AppName){
    	System.out.println("In GoToAppURL ................................................ ");
    	if (AppName.equalsIgnoreCase("Boss URL")){
    		
			 DriverFactory.getDriver().get(Constant.BASE_URL);
		 }
		 else if (AppName.equalsIgnoreCase("Payments2")){
			 DriverFactory.getDriver().get(Constant.PAYMENT_URL);
		 }else{
			 System.out.println("In else Base URL");
			 DriverFactory.getDriver().get(Constant.BASE_URL);
		 }    	
	 	 AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
    }
    
    public void verifyGalaxyStaticHomePage(){
		Assert.assertTrue(DriverFactory.getDriver().getTitle().contains("Payment Galaxy™ Static Data"),"Payment Galaxy™ Static Data Page Title mismatch!");
    }



	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

}