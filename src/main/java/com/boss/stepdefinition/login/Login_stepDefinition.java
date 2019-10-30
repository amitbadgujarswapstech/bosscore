/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.stepdefinition.login;

import cucumber.api.java.en.Then;

import com.boss.framework.BaseDrivers;
import com.boss.pages.login.LoginPage;

public class Login_stepDefinition {
	private LoginPage LoginPage;

	
	public Login_stepDefinition(BaseDrivers driver, LoginPage LoginPage) {
		this.LoginPage = LoginPage;
	}
	
	@Then("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		System.out.println("user_enters_username_and_password" );
		LoginPage.enter_UsernameAndPassword(username,password);
	}
	
	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button()  {
		System.out.println("user_clicks_on_Login_Button" );
		LoginPage.click_Login();
	}
	
	 @Then("^user checks snapshot for LoginPage$")
	 public void user_checks_snapshot_for_LoginPage()  {
		System.out.println("user_checks_snapshot_for_LoginPage");
       	LoginPage.verify_Snapshot();
	 }
	 
}


