/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.stepdefinition.common;

import java.sql.SQLException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.AppsCommon;
import com.boss.framework.utils.Database;
import com.boss.pages.login.LoginPage;

public class AppsCommon_stepDefinition {
	private AppsCommon AppsCommon;
	private LoginPage LoginPage;
	
	public AppsCommon_stepDefinition(BaseDrivers driver, AppsCommon AppsCommon, LoginPage LoginPage) {
		this.AppsCommon = AppsCommon;
		this.LoginPage = LoginPage;

	}
	
	//FOOTER ADD/SAVE Button Click
	@And("^user must click on the \"([^\"]*)\" button$")
	public void user_must_click_on_the_button(String buttonName) {
		System.out.println("user_must_click_on_the_button: " + buttonName);
		if (buttonName.toLowerCase().equals("add")) {
			AppsCommon.click_Add();
		} else if (buttonName.toLowerCase().equals("save")) {
			AppsCommon.click_Save();
		} else if (buttonName.toLowerCase().equals("cancel")) {
			AppsCommon.click_Cancel();
		}
		com.boss.framework.utils.AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
	}
	
	//DB Scenarios
	 @Given("^I am connected to database \"([^\"]*)\" using valid credentials$")
	 public void i_am_connected_to_database_using_valid_credentials(String databaseName)  {
		 System.out.println("i_am_connected_to_database_using_valid_credentials");
		 Database.getConnection(databaseName); 
	 }
	 
	 @Then("^Execute SQL query as \"([^\"]*)\"$")
	 public void execute_SQL_query_as(String Query) throws SQLException {
		 System.out.println("execute_SQL_query_as: " + Query);
		 Database.executeUpdate(Query); 
	 }
	 
	 @Then("^Execute SQL Select query as \"([^\"]*)\"$")
	 public void execute_SQL_Select_query_as(String Query) throws SQLException {
		 System.out.println("execute_SQL_Select_query_as: " + Query);
		 Database.executeQuery(Query); 
	 }
	 
	 @Then("^user sets configuration for ocular snapshots for \"([^\"]*)\" resolution similarity to \"([^\"]*)\"$")
	 public void user_sets_configuration_for_ocular_snapshots_for_resolution_similarity_to(String resolution, int SimilarityPercent)  {
		System.out.println("user_sets_configuration_for_ocular_snapshots_for_resolution: " + resolution + "with Similarity of: " + SimilarityPercent);
		AppsCommon.ocularConfig(resolution, SimilarityPercent);
	 }
		
		
}


