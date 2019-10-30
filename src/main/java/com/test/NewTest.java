package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	private WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Serlenium-Setup\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void verifySearchButton() {
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

		String search_text = "Google Search";
		WebElement search_button = driver.findElement(By.name("btnK"));

		String text = search_button.getAttribute("value");

		Assert.assertEquals(text, search_text, "Text not found!");
	}
}