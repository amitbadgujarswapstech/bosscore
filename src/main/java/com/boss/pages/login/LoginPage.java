/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.pages.login;

import com.boss.framework.BaseDrivers;
import com.boss.framework.utils.AppsCommon;
import com.boss.framework.utils.DriverFactory;
import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.comparator.OcularResult;
import com.testautomationguru.ocular.snapshot.Snap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

@Snap("LoginPage.png")
public class LoginPage extends LoadableComponent<LoginPage> {
	//PageObjects 
	@FindBy(xpath="(.//*[@class='required'])[1]")
	WebElement txtUsername;
	@FindBy(xpath="(.//*[@class='required'])[2]")
	WebElement txtPassword;
	@FindBy(xpath=".//*[@class='btn btn-submit btn-block']")
	WebElement btnLogin;
	@FindBy(xpath=".//*[@class='fa fa-user-o']")
	WebElement menuUser;
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement menuItemLogOut;
	
    public LoginPage() {
    	PageFactory.initElements(DriverFactory.getDriver(), this);
    }

	public void enter_UsernameAndPassword(String username, String password){
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);
		AppsCommon.sendKeys(txtUsername, DriverFactory.getDriver(),username);
		AppsCommon.sendKeys(txtPassword, DriverFactory.getDriver(),password);
	}
	
	public void click_Login(){
		AppsCommon.click(btnLogin, DriverFactory.getDriver());
		AppsCommon.waitForPageFullyLoaded(BaseDrivers.defaultTimeout, 2);		
	}
	
	public void click_Logout(){
		try{
			AppsCommon.click(menuItemLogOut, DriverFactory.getDriver());
		} catch (Exception e){
			DriverFactory.getDriver().get(BaseDrivers.BaseURL + "/cas/logout");
		}
	}
	
	public void perform_Logout(){
		AppsCommon.click(menuUser, DriverFactory.getDriver());
		click_Logout();
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
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}


 
	
}
