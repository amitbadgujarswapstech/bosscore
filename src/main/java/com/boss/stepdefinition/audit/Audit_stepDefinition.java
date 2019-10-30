/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.stepdefinition.audit;

import java.util.ArrayList;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import com.boss.framework.BaseDrivers;
import com.boss.pages.audit.AuditPage;

import java.util.Map;

public class Audit_stepDefinition {
	private AuditPage AuditPage;

	public Audit_stepDefinition(BaseDrivers driver, AuditPage AuditPage) {
		this.AuditPage = AuditPage;
	}
	
	@And("^Audit table should show following old \"([^\"]*)\" and new \"([^\"]*)\" for below fields \"([^\"]*)\"$")
	public void audit_table_should_show_following_old_and_new_for_below_fields(String arg1, String arg2, String arg3, DataTable itemsToSearch){
		ArrayList<String> listOfItemsToVerify = new ArrayList<String>();
		String fieldName = null;
		//Form an arraylist of all items to be searched
		for (Map<String, String> data : itemsToSearch.asMaps(String.class, String.class)) {
			listOfItemsToVerify.clear();
			if (data.get("Fields")!=null){
				fieldName = data.get("Fields");
				listOfItemsToVerify.add(data.get("Fields"));
			}
			if (data.get("Oldvalue")!=null){
				listOfItemsToVerify.add(data.get("Oldvalue"));
			}
			if (data.get("Newvalue")!=null){
				listOfItemsToVerify.add(data.get("Newvalue"));
			}
			AuditPage.verifyAuditTableForOldNewValues(fieldName,listOfItemsToVerify);
		}
	}
}


