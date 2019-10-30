/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.DriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {

	@After
	public static void teardown(Scenario scenario) {
		//If scenario is failed, take screenshot and embed it with scenario & then close the browser
	    if (scenario.isFailed()) {
	      try {
	        byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	        scenario.embed(screenshot, "image/png");
	      } catch (WebDriverException wde) {
	        System.err.println(wde.getMessage());
	      } catch (ClassCastException cce) {
	        cce.printStackTrace();
	      }
	    }
	    BaseDrivers.afterClass(); //close_the_browser
	}
}
