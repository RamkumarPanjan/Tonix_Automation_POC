package com.tonix.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.extent.ExtentReporter;

public class TonixTestFlow extends BaseTestCase {

	@Test(priority = 0)
	@Parameters({"userType"})
    public void stashFlow() throws Exception {
		//welcomePage.RingPayAppLaunch();
		loginPage.performLogin();
		mainPage.clickTotalStashBalance();
		ExtentReporter.jiraID = "PP-28";
	}

}
