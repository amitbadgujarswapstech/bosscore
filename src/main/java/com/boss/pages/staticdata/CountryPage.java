/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.pages.staticdata;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.AppsCommon;
import com.boss.framework.utils.DriverFactory;
import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.comparator.OcularResult;
import com.testautomationguru.ocular.snapshot.Snap;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

@Snap("CountryPage.png")
public class CountryPage extends LoadableComponent<CountryPage>{
	WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), BaseDrivers.defaultTimeout);
	//PageObjects 	
	@FindBy(xpath="//a[@id='link2']//span[@class='menu-title ng-tns-c3-0'][contains(text(),'Country')]")
	WebElement menuCountry;
	@FindBy(xpath="//span[contains(text(),'Currency Pair')]")
	WebElement menuCurrencyPair;	
	@FindBy(xpath="//a[@title='Add Country']")
	WebElement btnAddCountryPlusSign;
	@FindBy(xpath="//input[@id='mat-input-9']")
	WebElement txtCountryCode;
	@FindBy(xpath="(.//*[@matinput=''])[2]")
	WebElement txtCountryName;
	@FindBy(xpath="(.//*[@matinput=''])[3]")
	WebElement txtPhoneCountryCode;	
	@FindBy(xpath="(.//*[@matinput=''])[4]")
	WebElement txtPhoneNumberLength;		
	@FindBy(xpath="//currency-lookup/angular2-multiselect/div/div/div/span")
	WebElement ObjCurrency;
	@FindBy(xpath="//currency-lookup/angular2-multiselect/div/div[2]/div/div/input")	
	WebElement txtCurrency;
	@FindBy(xpath="//currency-lookup/angular2-multiselect/div/div/div/ul/span/li")
	WebElement cBoxCurrencyFilterResults;
	@FindBy(xpath="(.//*[@class='mat-form-field-infix'])[6]")
	WebElement lblPaymentCurrencies;	
	@FindBy(xpath="(.//*[@class='c-btn'])[2]") 
	WebElement ObjPaymentCurrencies;
	@FindBy(xpath="//div[@class='c-list ng-star-inserted']") 
	WebElement ObjPaymentCurrenciesInserted;
	@FindBy(xpath="(.//*[@class='autofocuslookup ng-star-inserted'])[2]")
	WebElement txtPaymentCurrencies;
	@FindBy(xpath="//span/label[contains(@for,'paymentCurrencies')]/parent::span/parent::div/currency-lookup/angular2-multiselect/div/div/div/ul/span/li")	
	WebElement cBoxPaymentCurrenciesFilterResults;	
	@FindBy(xpath="//span[.=' High Risk Country ']")
	WebElement sethighRiskCountry;	
	@FindBy(xpath="//div[@class='mat-select-value']")
	WebElement txtlookUpMethod;	
	@FindBy(xpath="//span[.=' National Bank Identifier Available ']")
	WebElement setNBIdentifier;	
	@FindBy(xpath="//span[.=' Bank Account is unique in the country ']")
	WebElement setUniqueBank;	
	@FindBy(xpath="//input[contains(@id,'input_nationalBankAccountNumberIdentifier')]")
	WebElement uniqueBankAccounterName;		
	@FindBy(xpath="//button[@class='btn btn-primary mat-button ng-star-inserted']")
	WebElement btnAdd;
	@FindBy(xpath="//input[@id='formly_8_input_nationalClearingCode_3']")
	WebElement txtNationalClearingCode;
	@FindBy(xpath="//mat-error[@class='mat-error']")
	WebElement txtErrMesgToUser;
	@FindBy(xpath="//*[@id='toast-container']/div/div")
	WebElement txtSuccessMesgToUser;	
	//Search Scenarios
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement txtSearchCountry;	
	String tblSearchCountryResults = "//ngx-datatable[@class='material ngx-datatable fixed-header fixed-row virtualized']";
	@FindBy(xpath="//div[@class='empty-row ng-star-inserted']")
	WebElement txtSearchNoDataMesgToUser;
	//Edit Scenarios
	@FindBy(xpath="//span[contains(text(),'Country Code')]")
	WebElement hdrCountryCode;		
	@FindBy(xpath="(.//*[@title='Country Code']//span)[3]")
	WebElement btnSortByCountryCode;
	@FindBy(xpath="(.//*[@class='ng-star-inserted'])[5]")	
	WebElement txtEditCountryCode;	
	@FindBy(xpath="(.//*[@matinput=''])[2]")	
	WebElement txtEditCountryName;		

	//Delete Scenarios
	@FindBy(xpath="//mat-dialog-container[1]")	
	WebElement dialogWindowDelete;
	@FindBy(xpath="//h2[contains(text(),'Delete Record?')]")	
	WebElement dialogWindowDeleteTitle;	
	@FindBy(xpath="//mat-dialog-content[contains(text(),'Are you sure?')]")	
	WebElement dialogWindowDeleteContents;		 
	@FindBy(xpath="//mat-dialog-container[1]/delete-confirm-dialog[1]/mat-dialog-actions[1]/button[1]")	
	WebElement dialogWindowDeleteNoButton;
	@FindBy(xpath="//mat-dialog-container[1]/delete-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")	
	WebElement dialogWindowDeleteYesButton;	
	
	public CountryPage() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	//Country Home Page
	public void click_CountryMenu(){
		try{
			AppsCommon.click(menuCountry, DriverFactory.getDriver());
		} catch (Exception e){
			DriverFactory.getDriver().get(BaseDrivers.BaseURL + "staticdata/#/staticdata/country-summary");
		}
	}
 
	public void click_CountryAddMenu(){
		try{
			AppsCommon.click(btnAddCountryPlusSign, DriverFactory.getDriver());
		} catch (Exception e){
			DriverFactory.getDriver().get(BaseDrivers.BaseURL + "staticdata/#/staticdata/country-edit/countryCode");
		}
	}
  
    //Add Country Page
	public void enter_CountryCode(String CountryCodeName){
        AppsCommon.sendKeys(txtCountryCode, DriverFactory.getDriver(),CountryCodeName);
	}
	
	public void click_CountryName(){
		AppsCommon.click(txtCountryName, DriverFactory.getDriver());
	}
	
	public void enter_NCCode(String NCName){
        AppsCommon.sendKeys(txtNationalClearingCode, DriverFactory.getDriver(),NCName);
		txtNationalClearingCode.sendKeys(Keys.TAB);
	}
	

	public void selectCurrency(String currency){
		try{
			System.out.println("Currency to be selected is: " + currency);
			AppsCommon.click(ObjCurrency, DriverFactory.getDriver());
			AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
			AppsCommon.sendKeys(txtCurrency, DriverFactory.getDriver(),currency);
			AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
			BaseDrivers.sleep(1);
			//Using POM can't define runtime xpath in beginning.
			WebElement childweekendElement = DriverFactory.getDriver().findElement(By.xpath(String.format("//span/label[contains(@for,'ccyCode')]/parent::span/parent::div/currency-lookup/angular2-multiselect/div/div/div/ul/span/li/label[contains(text(),'%s')]",currency)));
//			Actions actions = new Actions(DriverFactory.getDriver());
//			actions.moveToElement(childweekendElement).perform();
			AppsCommon.click(childweekendElement, DriverFactory.getDriver());
		} catch (Exception e){
			System.out.println(e);
		}
	}
	
	public void selectPaymentCurrency(String CurrencyName){
		try{
			System.out.println("Payment Currency to be selected is: " + CurrencyName);
			AppsCommon.click(ObjPaymentCurrencies, DriverFactory.getDriver());
			AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
			txtPaymentCurrencies.clear();
			AppsCommon.sendKeys(txtPaymentCurrencies, DriverFactory.getDriver(),CurrencyName);
			BaseDrivers.sleep(3);
			//Using POM can't define runtime xpath in beginning.
//			WebElement childweekendElement = DriverFactory.getDriver().findElement(By.xpath(String.format("//span/label[contains(@for,'paymentCurrencies')]/parent::span/parent::div/currency-lookup/angular2-multiselect/div/div/div/ul/span/li/label[contains(text(),'%s')]",CurrencyName)));
//			AppsCommon.click(childweekendElement, DriverFactory.getDriver());
			AppsCommon.click(cBoxPaymentCurrenciesFilterResults, DriverFactory.getDriver());
			AppsCommon.click(lblPaymentCurrencies, DriverFactory.getDriver());
		} catch (Exception e){
			System.out.println(e);
		}
	}

	public void enter_CountryAddorEditFields(String countryCode, String countryName, String currency, String payment_currencies, String high_risk_country,String PhNumberLength ,String PhCountryCode){
		if (countryCode!=null){
			enter_CountryCode(countryCode);
		}
		if (countryName!=null){
			txtCountryName.clear();
			AppsCommon.sendKeys(txtCountryName, DriverFactory.getDriver(),countryName);
		}
		if (currency!=null){
			selectCurrency(currency);
		}
		if (payment_currencies!=null){
			selectPaymentCurrency(payment_currencies);
		}
		if (high_risk_country!=null){
			AppsCommon.click(sethighRiskCountry, DriverFactory.getDriver());
		}
		if (PhCountryCode!=null){
			txtPhoneCountryCode.clear();			
			AppsCommon.sendKeys(txtPhoneCountryCode, DriverFactory.getDriver(),PhCountryCode);
		}	
		if (PhNumberLength!=null){
			txtPhoneNumberLength.clear();			
			AppsCommon.sendKeys(txtPhoneNumberLength, DriverFactory.getDriver(),PhNumberLength);
		}
	}
	
	public void verify_CountryFields(String countryCode, String countryName, String currency, String payment_currencies, String high_risk_country,String PhNumberLength ,String PhCountryCode){
		if (countryCode!=null){
			AppsCommon.verifyValueForMatInputElement(txtCountryCode, countryCode);
		}
		if (countryName!=null){
			AppsCommon.verifyValueForMatInputElement(txtCountryName, countryName);
		}
		if (currency!=null){
//			AppsCommon.verifyText(txtCurrency, currency);
		}
		if (payment_currencies!=null){
//			AppsCommon.verifyText(txtPaymentCurrencies, payment_currencies);
		}
//		if (high_risk_country!=null){
//			AppsCommon.verifyText(sethighRiskCountry, high_risk_country);
//		}
		if (PhCountryCode!=null){
			AppsCommon.verifyValueForMatInputElement(txtPhoneCountryCode, PhCountryCode);
		}	
		if (PhNumberLength!=null){
			AppsCommon.verifyValueForMatInputElement(txtPhoneNumberLength, PhCountryCode);
		}
	}
	
	public void verifyLookUp(String lookUpMethod1, String lookUpMethod2){
		String actualLookUpValues = txtlookUpMethod.getText();
		Assert.assertTrue(actualLookUpValues.toLowerCase().contains(lookUpMethod1.toLowerCase()));
		Assert.assertTrue(actualLookUpValues.toLowerCase().contains(lookUpMethod2.toLowerCase()));
	}

	public void verifyLookUp(String lookUpMethod1, String lookUpMethod2, String lookUpMethod3){
		String actualLookUpValues = txtlookUpMethod.getText();
		System.out.println(actualLookUpValues);
		Assert.assertTrue(actualLookUpValues.toLowerCase().contains(lookUpMethod1.toLowerCase()));
		Assert.assertTrue(actualLookUpValues.toLowerCase().contains(lookUpMethod2.toLowerCase()));
		Assert.assertTrue(actualLookUpValues.toLowerCase().contains(lookUpMethod3.toLowerCase()));
	}
	
	public void enableBankSettings(String settingNameToEnable){
		if (settingNameToEnable.equals("National bank identifier available")){
			AppsCommon.click(setNBIdentifier, DriverFactory.getDriver());
		}
		if (settingNameToEnable.equals("Bank account is unique in the country")){
			AppsCommon.click(setUniqueBank, DriverFactory.getDriver());
		}
	}
	
	public void enterUniqueBankAccountIdentifierName(String bankAccounterName){
		AppsCommon.sendKeys(uniqueBankAccounterName, DriverFactory.getDriver(),bankAccounterName);
		uniqueBankAccounterName.sendKeys(Keys.TAB);
	}
	


	public void verifyFieldErrorMesg(String expectedErrMesg){
		wait.until(ExpectedConditions.visibilityOf(txtErrMesgToUser));
		String Actualtext= txtErrMesgToUser.getText().trim(); 
		Assert.assertEquals(expectedErrMesg, Actualtext);
	}
	
	public void verifySuccessMessage(String successMesgTextToVerify){
		wait.until(ExpectedConditions.visibilityOf(txtSuccessMesgToUser));
		String Actualtext= txtSuccessMesgToUser.getText().trim(); 
		Assert.assertEquals(successMesgTextToVerify.toLowerCase(), Actualtext.toLowerCase());
	}

//*************Search Scenarios*************		
	public void searchCountry(String searchText){
		txtSearchCountry.clear();
		AppsCommon.sendKeys(txtSearchCountry, DriverFactory.getDriver(),searchText);
		txtSearchCountry.sendKeys(Keys.ENTER);
	}
	
	public boolean verifySearchNoDataMessage(String MesgTextToVerify){
		wait.until(ExpectedConditions.visibilityOf(txtSearchNoDataMesgToUser));
		String Actualtext= txtSearchNoDataMesgToUser.getText().trim(); 
		Assert.assertEquals(MesgTextToVerify.toLowerCase(), Actualtext.toLowerCase());
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public void verifyCountrySearchResultsData(String countryCode, ArrayList<String> listOfItemsToVerify){
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
		ArrayList<String> actualDataList = new ArrayList<String>();
		List<Object> returnedValues = null;
		returnedValues = AppsCommon.searchItemInTable(tblSearchCountryResults, 1,countryCode); 
		actualDataList = (ArrayList<String>) returnedValues.get(1);
		Boolean pass = AppsCommon.compareTwoList(actualDataList,listOfItemsToVerify);
		if (!pass)
    		throw new RuntimeException("Expected values: " + listOfItemsToVerify + " not found in: " + actualDataList);		
	}
	

//*************Edit Scenarios*************
	public void click_SortByCountryCode(){
		AppsCommon.click(hdrCountryCode, DriverFactory.getDriver());
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout,2);
	}
	
	public void click_editCountryIcon(String CountryCode){
		try{
			//Using POM can't define runtime xpath in beginning.
			WebElement editCountry = DriverFactory.getDriver().findElement(By.xpath(String.format("//*[@href='#/staticdata/country-edit/%s']",CountryCode)));
			AppsCommon.click(editCountry, DriverFactory.getDriver());
		} catch (Exception e){
			DriverFactory.getDriver().get(BaseDrivers.BaseURL + String.format("staticdata/#/staticdata/country-edit/%s",CountryCode));
		}
	}
	
	public void verifyCountryisDisabled() {
		AppsCommon.VerifyIfElementisDisabled(txtEditCountryCode);
	}
	
//*************Delete Scenarios*************
	public void clickDeleteCountryIcon(String CountryCode){
		String tempXpath;
		tempXpath = tblSearchCountryResults + String.format("//*[@href='#/staticdata/country-edit/%s']/following-sibling::a[1]",CountryCode);
		WebElement deleteCountry = DriverFactory.getDriver().findElement(By.xpath(tempXpath));
		AppsCommon.click(deleteCountry, DriverFactory.getDriver());
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout,2);	
	}
	
	public void verifyDeleteConfirmationWindow(){
		DriverFactory.getDriver().switchTo().defaultContent();
		Assert.assertTrue(dialogWindowDeleteTitle.isDisplayed());
		Assert.assertTrue(dialogWindowDeleteContents.isDisplayed());
	}
	
	public void clickYesNoOnConfirmation(String buttonName){
		if (buttonName.equalsIgnoreCase("No"))
			AppsCommon.click(dialogWindowDeleteNoButton, DriverFactory.getDriver());
		else if (buttonName.equalsIgnoreCase("Yes"))
			AppsCommon.click(dialogWindowDeleteYesButton, DriverFactory.getDriver());
	}
	
//*************Audit Scenarios*************	
	public void clickAuditCountryIcon(String CountryCode){
		String tempXpath;		
		tempXpath = tblSearchCountryResults + String.format("//*[@href='#/staticdata/country-edit/%s']/following-sibling::a[2]",CountryCode);
		WebElement auditCountry = DriverFactory.getDriver().findElement(By.xpath(tempXpath));
		AppsCommon.click(auditCountry, DriverFactory.getDriver());
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout,2);	
	}
	
	public void verify_Snapshot(){
		Assert.assertTrue(compare().isEqualsImages());
	}
	
    public OcularResult compare() {
        return Ocular.snapshot()
                        .from(this)
                      .sample()
                           .using(DriverFactory.getDriver())
                      .compare();
    }
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
}
