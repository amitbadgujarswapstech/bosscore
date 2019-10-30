package com.boss.stepdefinition.home;

import com.boss.framework.BaseDrivers;
import com.boss.pages.account.AccountTransfer;

import cucumber.api.java.en.Given;

public class Account_Transfer_stepDefination {
	private AccountTransfer account_Transfer;
	
	public Account_Transfer_stepDefination(BaseDrivers driver, AccountTransfer account_Transfer) {
		this.account_Transfer = account_Transfer;
	}
	
    @Given("^I launch the application \"(.*)\"$")
	public void I_launch_the_application(String AppName) {
    	System.out.println("I_launch_the_application" );
        //Navigate to specified Application Static Data page or Payments Page 
		AccountTransfer.GoToAppURL(AppName);
	}
}
