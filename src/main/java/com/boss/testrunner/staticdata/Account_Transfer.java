/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.testrunner.staticdata;

//import java.io.File;
import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
//@Test
@CucumberOptions(
		features = { "src/test/resources/account-transfer.feature"},
		glue = { "com/boss/stepdefinition" },
	    plugin= {"pretty","html:target/cucumber-pretty", "json:target/account-transfer.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
	    monochrome = true, //display the console output in a proper readable format
	    strict = true, //it will check if any step is not defined in step definition file
	    dryRun = false, //to check the mapping is proper between feature file and step def file & get missing method snippets 
	    tags = {"~@CreateTestData"}
)

public class Account_Transfer extends AbstractTestNGCucumberTests{}
//	public class Country_add {
//	@Test
//	public void runCukes() {
//		
//		new TestNGCucumberRunner(getClass()).runCukes();
//	}
//}
