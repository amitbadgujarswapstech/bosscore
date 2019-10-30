/**
 * @author jayashree.kolambe
 * 16-Aug-2019
**/
package com.boss.stepdefinition;
import com.boss.framework.BaseDrivers;

import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	public static void setUp() {
        //Read ENV,set the domain BaseURL accordingly and Launch the specified Browser
		BaseDrivers.beforeClass();
	}
}
