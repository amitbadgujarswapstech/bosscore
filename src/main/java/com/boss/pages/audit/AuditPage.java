/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.pages.audit;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.boss.framework.utils.AppsCommon;
import com.boss.framework.utils.DriverFactory;

public class AuditPage extends LoadableComponent<AuditPage> {
	//PageObjects 
	String tblAuditTable = "//ngx-datatable[@class='material box-shadow-none server-scrolling-demo ngx-datatable fixed-header fixed-row scroll-vertical virtualized']";

    public AuditPage() {
		PageFactory.initElements(DriverFactory.getDriver(), this);
    }

	@SuppressWarnings("unchecked")
	public void verifyAuditTableForOldNewValues(String fieldName, ArrayList<String> listOfItemsToVerify){
		System.out.println("verifyAuditTableForOldNewValues - listOfItemsToVerify " + listOfItemsToVerify);
		DriverFactory.getDriver().switchTo().defaultContent();
		ArrayList<String> actualDataList = new ArrayList<String>();
		List<Object> returnedValues = null;
		if (!fieldName.toLowerCase().contains("date")){
			returnedValues = AppsCommon.searchItemInTable(tblAuditTable, 1,fieldName); 
			actualDataList = (ArrayList<String>) returnedValues.get(1);
			Boolean pass = AppsCommon.compareTwoList(actualDataList,listOfItemsToVerify);
			if (!pass)
	    		throw new RuntimeException("Expected values: " + listOfItemsToVerify + " not found in: " + actualDataList);		
		}
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
    
	
