/**
 * @author jayashree.kolambe
 **/
package com.boss.framework.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.boss.framework.BaseDrivers;

public final class DriverFactory {

	private static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();

	// To quit the drivers and browsers at the end only.
	private static List<WebDriver> storedDrivers = new ArrayList<>();
    //Comment this part if you don't want to close browser post execution
	// If you are not running removeDriver in @After then browser will get closed at this step
	static { 
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Shutdown Hook is running close and quit each webdriver!");
			for (WebDriver driver : storedDrivers){
				System.out.println("Closing driverID: " + driver);
//				driver.close();
//				driver.quit();
				BaseDrivers.KillChrome();
			}
			}));
	}

	private DriverFactory() {}

	public static WebDriver getDriver() {
		return drivers.get();
	}

	public static void addDriver(WebDriver driver) {
		storedDrivers.add(driver);
		drivers.set(driver);
	}

	public static void removeDriver() {
		System.out.println("RemoveDriver has closed driver & removed from it from stored list: " + drivers.get());
		drivers.get().close(); //Close browser
		storedDrivers.remove(drivers.get()); // Remove from storeddrivers lists
		drivers.remove();
	}
}
