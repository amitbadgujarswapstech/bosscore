/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.framework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.boss.framework.utils.DriverFactory;
import com.boss.framework.utils.GeneralUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDrivers {
	protected static String browserType;
	protected static String browserVersion;
	protected static String Env;
	public static String BaseURL;
	public static String DB_IP;
	public static String DB_Port;
	public static String DB_Username;
	public static String DB_Password;
	public static int defaultTimeout = Integer.parseInt(GeneralUtils.readConfig("DEFAULT_TIMEOUT"));
	protected static int implicitWait = Integer.parseInt(GeneralUtils.readConfig("IMPLICIT_WAIT"));

	public static WebDriver driver; 
	
    public static void beforeClass()
    {
		//Read from POM Command line DENV, DBROWSER_TYPE or read them from config.properties
		//Read Environment
		if (System.getProperty("ENV") != null) 
			Env = System.getProperty("ENV");
		else
			Env = GeneralUtils.readConfig("ENV");
		//Set BaseURL according to ENV
		if (Env.equalsIgnoreCase("Test")) 
//			BaseURL = "https://galaxy-test.swapstech.net/";
			//TODOA
			BaseURL = "https://qa3.swapstech.net/sso/login?";
		else if (Env.equalsIgnoreCase("Dev")) 
			BaseURL = "https://galaxy.swapstech.net/";
		//TODOA	
		//BaseURL = "https://qa3.swapstech.net/sso/login";
		//Set Database DB Properties according to ENV
		if (Env.equalsIgnoreCase("Test")) {
			DB_IP = "3.13.2.34";
			DB_Port = "3309";
			DB_Username = "galaxy_db_user";
			DB_Password = "pass@Galaxy18";
			}
		else if (Env.equalsIgnoreCase("Dev")) { //DEV DB Properties are not be shared by IT, so can't connect DB
			throw new RuntimeException("DB access to DEV is not provided. Can't proceed with data cleanup!!! ");
			}
		//SetUp Browser_Type
		if (System.getProperty("BROWSER_TYPE")!=null) //Read from POM Command line DBROWSER_TYPE or read from config.properties
			browserType = System.getProperty("BROWSER_TYPE");
		else
			browserType=GeneralUtils.readConfig("BROWSER_TYPE");
		//SetUp Browser_Version
		if (System.getProperty("BROWSER_VERSION")!=null) //Read from POM Command line DBROWSER_VERSION or read from config.properties
			browserVersion = System.getProperty("BROWSER_VERSION");
		else
			browserVersion=GeneralUtils.readConfig("BROWSER_VERSION");
		//Printing all configuration settings to console
        System.out.println("ENVIRONMENT is: " + Env);
        System.out.println("BROWSER TYPE is: " + browserType);
        System.out.println("BROWSER_VERSION specified is: " + browserVersion);
        System.out.println("DEFAULT TIMEOUT(secs) is : " + defaultTimeout);	
        
		if(browserType.equalsIgnoreCase("firefox")||browserType.equalsIgnoreCase("ff")){
			startFirefox();
		}
		else if(browserType.equalsIgnoreCase("chrome")){    
			startChrome();
		}else if(browserType.equalsIgnoreCase("edge")){    
			startMsEdge();		
	    }
    }
		
    public static void startFirefox() {
    	System.out.println(Thread.currentThread().getId() + " Thread.currentThread CONST");
		if (browserVersion == null) {
			WebDriverManager.firefoxdriver().setup();
		} else {
			WebDriverManager.firefoxdriver().version(browserVersion).setup();
		}
		DriverFactory.addDriver(new FirefoxDriver());
		DriverFactory.getDriver().manage().window().maximize(); 
		DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(defaultTimeout , TimeUnit.SECONDS);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }
		   
    public static void startChrome() {

		System.out.println(Thread.currentThread().getId() + " Thread.currentThread CONST");
		String chromedriverPath = null;
		ChromeOptions chromeOptions =  new ChromeOptions();
		System.out.println("OS Found is: "+ System.getProperty("os.name").toLowerCase());
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			chromedriverPath = System.getProperty("user.dir")+"/src/main/java/com/boss/framework/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromedriverPath);
			if (browserVersion == null) {
					WebDriverManager.chromedriver().setup();
				} else {
					WebDriverManager.chromedriver().version(browserVersion).setup();
				}
			DriverFactory.addDriver(new ChromeDriver());
    	}
		else {
			chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-dev-shm-usage");
			chromedriverPath = System.getProperty("user.dir")+"/src/main/java/com/boss/framework/drivers/chromedriver";
			System.setProperty("webdriver.chrome.driver", chromedriverPath);
			if (browserVersion == null) {
				WebDriverManager.chromedriver().setup();
			} else {
				WebDriverManager.chromedriver().version(browserVersion).setup();
			}
			DriverFactory.addDriver(new ChromeDriver(chromeOptions));
		}
		
		DriverFactory.getDriver().manage().window().maximize(); 
		DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(defaultTimeout , TimeUnit.SECONDS);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }
   			
    public static void startMsEdge() {
		System.out.println(Thread.currentThread().getId() + " Thread.currentThread CONST");
		if (browserVersion == null) {
			WebDriverManager.edgedriver().setup();
		} else {
			WebDriverManager.edgedriver().version(browserVersion).setup();
		}
		DriverFactory.addDriver(new EdgeDriver());
		DriverFactory.getDriver().manage().window().maximize(); 
		DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(defaultTimeout , TimeUnit.SECONDS);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	}
	
	public static void afterClass()
	{	
		if(DriverFactory.getDriver() != null)
		{ 
			DriverFactory.removeDriver();
		}
	}
	
	public static void KillChrome()
	{
		GeneralUtils.KillProcess("chromedriver.exe");
		sleep(2);
		GeneralUtils.KillProcess("chrome.exe");
		sleep(2);
		try {
			Runtime.getRuntime().exec("cmd /c del /q /s /f C:\\Users\\%USERNAME%\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cache\\*.*");
			Runtime.getRuntime().exec("cmd /c del /q /s /f C:\\Users\\%USERNAME%\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\*Cookies*.*");
			Runtime.getRuntime().exec("cmd /c del /q /s /f C:\\Users\\%USERNAME%\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\C*History*.*");
		} catch (Exception e) {				
			e.printStackTrace();
		}
	}
	
	public static void sleep(int timeout){
		try {
			Thread.sleep(timeout*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
