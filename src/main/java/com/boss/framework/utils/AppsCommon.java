/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.framework.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.DriverFactory;
import com.testautomationguru.ocular.Ocular;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Assert;

public class AppsCommon{
	static WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), BaseDrivers.defaultTimeout);
	
	@FindBy(xpath="//button[@class='btn btn-primary mat-button ng-star-inserted']")
	WebElement btnAdd;
	@FindBy(xpath="//span[contains(text(),'Save')]")	
	WebElement btnSave;
	@FindBy(xpath="//span[contains(text(),'Cancel')]")	
	WebElement btnCancel;

	
	public AppsCommon() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	public static boolean waitForPageFullyLoaded(int maxtimeout, int timeSlice) {
		int previous;
		int current = 0;
		//int timeSlice = 5;
		do {
		previous = current;
		BaseDrivers.sleep(timeSlice);
		maxtimeout -= timeSlice;
		current = DriverFactory.getDriver().findElements(By.xpath("//*")).size();	
		} while(current != previous && maxtimeout > 0);
		if(maxtimeout > 0) {
		return true;
		}
		return false;
		}
	
	//To handle Angular JS Sync issues
	public static void click(WebElement el, WebDriver driver){
			wait(el,driver);
			el.click();
	}
	
	//To handle Angular JS Sync issues
	public static void submit(WebElement el, WebDriver driver){
			wait(el,driver);
			el.submit();
	}
	
	//To handle Angular JS Sync issues
	public static void sendKeys(WebElement el, WebDriver driver, String TextToType){
		
		wait(el,driver);
		el.sendKeys(TextToType);
		System.out.println("In Send Keys method ...........");
}
	
	public static void wait(WebElement el, WebDriver driver){
	// Note: AngularJS elements gives sync issues while running; hence intelligent wait,refresh and retry logic is been implemented instead of sleep
			WebDriverWait wait = new WebDriverWait(driver,Integer.parseInt(GeneralUtils.readConfig("DEFAULT_TIMEOUT")));
			// Retry = 3 times. If the element is located for the first time then break
			for(int i=0; i<=2;i++){
				try{
					wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(el)));
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(el)));
					break;
				}catch(Exception e){
				     System.out.println(e.getMessage());
				  }
			}
		}

	//Functions written to traverse and search data from given table.
	public static int getTableColumnCount (String TableLocator){
		//TableLocator Ex: //ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']
		int colCount = 0;
		String formedXpath = TableLocator + "//datatable-header//datatable-header-cell";
		colCount = DriverFactory.getDriver().findElements(By.xpath(formedXpath)).size();
		System.out.println("Column count for table is: " + colCount);
		return colCount;
	}

	public static int getTableRowCount (String TableLocator){
		//TableLocator Ex: //ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']
		int rowCount = 0;
		String formedXpath = TableLocator + "//datatable-row-wrapper";
		rowCount = DriverFactory.getDriver().findElements(By.xpath(formedXpath)).size();
		System.out.println("Row count for table is: " + rowCount);
		return rowCount;
	}
	
	public static ArrayList<String> getTableRowData (String TableLocator, int RowNumber){
		//TableLocator Ex: //ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']
		int colCount = getTableColumnCount(TableLocator);
		String temp;
		String formedXpath;
		ArrayList<String> rowDataList = new ArrayList<String>();
		for (int i=1;i<=colCount;i++){
			formedXpath = TableLocator + String.format("//datatable-row-wrapper[%s]//datatable-body-cell[%s]", RowNumber,i);
			WebElement childwebElement = DriverFactory.getDriver().findElement(By.xpath(formedXpath));
			Actions actions = new Actions(DriverFactory.getDriver());
			actions.moveToElement(childwebElement).perform();
			temp = childwebElement.getText();
			rowDataList.add(temp);
		}
		System.out.println("Rownumber: " + RowNumber +" data for table is: " + rowDataList);
		return rowDataList;
	}
	
	public static ArrayList<String> getTableColumnData (String TableLocator, int ColumnNumber){
		//TableLocator Ex: //ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']
		int rowCount = getTableRowCount(TableLocator);
		String tempGetValue;
		String formedXpath;
		ArrayList<String> columnDataList = new ArrayList<String>();	
		for (int i=1;i<=rowCount;i++){
			formedXpath = TableLocator + String.format("//datatable-row-wrapper[%s]//datatable-body-cell[%s]",i, ColumnNumber);
			WebElement childwebElement = DriverFactory.getDriver().findElement(By.xpath(formedXpath));
			Actions actions = new Actions(DriverFactory.getDriver());
			actions.moveToElement(childwebElement).perform();
			tempGetValue = childwebElement.getText();
			columnDataList.add(tempGetValue);
		}
		System.out.println("Columnnumber: " + ColumnNumber +" data for table is: " + columnDataList);
		return columnDataList;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Object> searchItemInTable (String TableLocator, int ColumnNumber, String SearchToText){
		//TableLocator Ex: //ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']
		System.out.println("Item to search is: " + SearchToText + " in column number: " + ColumnNumber );
		int foundFlag = -1;
		int foundRowIndex = 0;
		int foundRecurIndex = 0;
		int i;
		ArrayList<String> columnDataList = new ArrayList<String>();
		ArrayList<String> rowDataList = new ArrayList<String>();
		List<Object> recurringWork = null;
		columnDataList = getTableColumnData(TableLocator,ColumnNumber);
		//Search Item in Column Data list
		for (i=0; i<=columnDataList.size()-1; i++){
			if (columnDataList.get(i).toLowerCase().contains(SearchToText.toLowerCase())){
				foundFlag = 1;
				foundRowIndex = i+1;
				System.out.println("Found Index Position at: " + foundRowIndex);
				rowDataList = getTableRowData(TableLocator,foundRowIndex);
				break;
			}
		}
		//If item is not found - Go to next page
		if (foundFlag != 1) {
			Boolean nextPageFound = pagination_goToNextPage();
			//Search Item in Table on Next Page, if next page is found, else stop recurring
			if (nextPageFound) {
				recurringWork = searchItemInTable(TableLocator,ColumnNumber,SearchToText);
				foundRecurIndex = (int) recurringWork.get(0);
				rowDataList = (ArrayList<String>) recurringWork.get(1);
			}
		}
		//Set row index value
		if (foundRecurIndex>=1)
			foundRowIndex = foundRecurIndex;
//		else 
//			foundRowIndex = foundRowIndex;
	return Arrays.asList(foundRowIndex, rowDataList);  
	}
	
	public static boolean compareTwoList(ArrayList<String> actualsList, ArrayList<String> expectedList) {
		System.out.println("Expected List: " + expectedList + "Checking in Actual list: " + actualsList);
	    for(String expected : expectedList) {
	        boolean found = false;
	        if(expected != null && !expected.isEmpty()){
		        for(String actual : actualsList) {
		            if(actual.toLowerCase().contains(expected.toLowerCase())) {
		                found = true;
		                break;
		            }
		        }
	        }
	        if (!found) {
	    		return false;
	        }
	    }    
	    return true;
	}
	
//	#### Basic common elements Actions n verifications
	public static void VerifyIfElementisDisabled(WebElement ElementNameToVerify) {
		wait(ElementNameToVerify,DriverFactory.getDriver());
		String value = ElementNameToVerify.getAttribute("disabled");
		try{
			if (value==null)
				System.out.println("Attribute 'disabled' is found for element successfully: " + ElementNameToVerify);
			else 
				throw new RuntimeException("Element is expected to be disabled, but found enabled: " + ElementNameToVerify);
				//softAssert.fail("Element is expected to be disabled, but found enabled: " + ElementNameToVerify);
		}catch (NullPointerException e){
			System.out.println("Attribute 'disabled' is found for element successfully: " + ElementNameToVerify);
		}
	}

	public static void VerifyIfElementisEnabled(WebElement ElementNameToVerify) {
		wait(ElementNameToVerify,DriverFactory.getDriver());
		try{
			ElementNameToVerify.getAttribute("disabled");
			throw new RuntimeException("Element is expected to be enabled, but found disabled: " + ElementNameToVerify);			
		} catch (Exception e){ //If it is enabled Attribute disabled will not be assigned. 
			System.out.println("Attribute 'disabled' is not found, which means element is enabled as expected." + ElementNameToVerify);
		}
	}
	
	public static void VerifyIfElementExists(String ElementNameToVerify, String ShouldExistsYesorNo) {
		//ExistsYesorNo values can be Yes or No
		if (ShouldExistsYesorNo.equalsIgnoreCase("yes")){
			if (DriverFactory.getDriver().findElements(By.xpath(ElementNameToVerify)).size() != 0 ) 
				System.out.println("Element is present as expected: " + ElementNameToVerify);
			else
				throw new RuntimeException("Element is expected to be present, but not found: " + ElementNameToVerify);	
		} else if(ShouldExistsYesorNo.equalsIgnoreCase("no")){
			if (DriverFactory.getDriver().findElements(By.xpath(ElementNameToVerify)).size() != 0 )
				throw new RuntimeException("Element is not expected to be present, but found: " + ElementNameToVerify);	
			else
				System.out.println("Element is not present as expected: " + ElementNameToVerify);
		}
	}
	
	public static void dropdownShouldContainValues(WebElement dropDownLocatorToClick, ArrayList<String> expectedList) {
	    ArrayList<String> actualValues = new ArrayList<String>();
	    AppsCommon.click(dropDownLocatorToClick, DriverFactory.getDriver());
	    //dropdown values locator for our boss project is //span[@class='mat-option-text']
		List<WebElement> matchingWEValuesList = DriverFactory.getDriver().findElements(By.xpath("//span[@class='mat-option-text']"));
		Actions actions = new Actions(DriverFactory.getDriver());
		for (int i = 0; i < matchingWEValuesList.size(); i++) {
			actions.moveToElement(matchingWEValuesList.get(i)).perform();
			actualValues.add(matchingWEValuesList.get(i).getText());
		}
		Boolean pass = AppsCommon.compareTwoList(actualValues,expectedList);
		if (!pass)
    		throw new RuntimeException("Expected values: " + expectedList + " not found in: " + actualValues);	
	}
	
	public static void selectValueFromDropdown(WebElement dropDownLocatorToClick, String ValueToSelect) {
		System.out.println("Dropdown value to be selected is: " + ValueToSelect + " from " + dropDownLocatorToClick);
		int valueFoundFlag = 0;
		List<WebElement> matchingWEValuesList = null;
		String actualValue = "";
	    AppsCommon.click(dropDownLocatorToClick, DriverFactory.getDriver());
	    BaseDrivers.sleep(1);
	    //dropdown values locator for our boss project is //span[@class='mat-option-text']
		matchingWEValuesList = DriverFactory.getDriver().findElements(By.xpath("//span[@class='mat-option-text']"));
		Actions actions = new Actions(DriverFactory.getDriver());
		for (int i = 0; i < matchingWEValuesList.size(); i++) {
			actions.moveToElement(matchingWEValuesList.get(i)).perform();
			actualValue = matchingWEValuesList.get(i).getText();
			if (actualValue.toString().trim().equalsIgnoreCase(ValueToSelect.trim())){
				matchingWEValuesList.get(i).click();
				valueFoundFlag = 1;
				break;
			}
		}
		if (valueFoundFlag == 0){
			throw new RuntimeException("Values specified: " + ValueToSelect + " is not found in dropdown for selection. " + dropDownLocatorToClick);	
		}
	 }
	
	public static void multiselectShouldContainValues(ArrayList<String> expectedList) {
	    ArrayList<String> actualValues = new ArrayList<String>();
	    //multiselect values locator for our Boss project observed is //currency-lookup/angular2-multiselect/div/div/div/ul/span/li']
		List<WebElement> matchingWEValuesList = DriverFactory.getDriver().findElements(By.xpath("//currency-lookup/angular2-multiselect/div/div/div/ul/span/li"));
		Actions actions = new Actions(DriverFactory.getDriver());
		for (int i = 0; i < matchingWEValuesList.size(); i++) {
			actions.moveToElement(matchingWEValuesList.get(i)).perform();
			actualValues.add(matchingWEValuesList.get(i).getText());
		}
		Boolean pass = AppsCommon.compareTwoList(actualValues,expectedList);
		if (!pass)
    		throw new RuntimeException("Expected values: " + expectedList + " not found in: " + actualValues);	
	}
	
	public static void cListShouldContainValues(ArrayList<String> expectedList) {
	    ArrayList<String> actualValues = new ArrayList<String>();
	    //multiselect values locator for our Boss project observed is //currency-lookup/angular2-multiselect/div/div/div/ul/span/li']
		List<WebElement> matchingWEValuesList = DriverFactory.getDriver().findElements(By.xpath("(.//*[@class='c-list ng-star-inserted'])/div/span[@class='c-label ng-star-inserted']"));
		Actions actions = new Actions(DriverFactory.getDriver());
		for (int i = 0; i < matchingWEValuesList.size(); i++) {
			actions.moveToElement(matchingWEValuesList.get(i)).perform();
			actualValues.add(matchingWEValuesList.get(i).getText());
		}
		Boolean pass = AppsCommon.compareTwoList(actualValues,expectedList);
		if (!pass)
    		throw new RuntimeException("Expected values: " + expectedList + " not found in: " + actualValues);	
	}
	
	
	public static void verifyText(WebElement InputTextLocator, String TextToVerify) {
		System.out.println("Text to verify : " + TextToVerify + " in: " + InputTextLocator);
		if (InputTextLocator.getText().toString().trim().equalsIgnoreCase(TextToVerify.trim())){}
		else {
			throw new RuntimeException("Expected Text is: " + TextToVerify + " whereas Actual text found is: " + InputTextLocator.getText().toString());	
		}
	 }
	
	public static void verifyValueForMatInputElement(WebElement InputTextLocator, String TextToVerify) {
		System.out.println("Value to verify : " + TextToVerify + " in: " + InputTextLocator);
		if (InputTextLocator.getAttribute("value").trim().equalsIgnoreCase(TextToVerify.trim())){}
		else {
//			throw new RuntimeException("Expected Text is: " + TextToVerify + " whereas Actual text found is: " + InputTextLocator.getText().toString());	
		}
	 }
	
	public void click_Add(){
		submit(btnAdd, DriverFactory.getDriver());
	}
	
	public void click_Save(){
		submit(btnSave, DriverFactory.getDriver());
	}
	
	public void click_Cancel(){
		click(btnCancel, DriverFactory.getDriver());
	}
	
	public static boolean pagination_goToNextPage() {
		boolean nextPageFound = false;
		String disabledNext = "//li[@class='disabled']//a[@aria-label='go to next page']";
		String btnSearchNxt = "//a[@aria-label='go to next page']";
		if (DriverFactory.getDriver().findElements(By.xpath(disabledNext)).size()==0){ //If element is enabled case
			AppsCommon.click(DriverFactory.getDriver().findElement(By.xpath(btnSearchNxt)), DriverFactory.getDriver());
			waitForPageFullyLoaded(BaseDrivers.defaultTimeout,2);
			nextPageFound = true;
		}
		else //Else if element is disabled then
			nextPageFound = false;
		return nextPageFound;
	}
	
	public static void ocularConfig(String resolutionSize, int SimilarityPercent) {
		 //Ocular config - Ocular should look for the baseline image depends on the dimension or device
		Path snapShotPath = Paths.get(System.getProperty("user.dir")+"/src/main/java/com/boss/framework/utils/ocular/pages_snapshot/", resolutionSize);
        Ocular.config()
             	.snapshotPath(snapShotPath)
                .resultPath(Paths.get(System.getProperty("user.dir")+"/src/main/java/com/boss/framework/utils/ocular/pages_snapshot/results"))
		        .globalSimilarity(SimilarityPercent)
		        .saveSnapshot(true);
    }
}
