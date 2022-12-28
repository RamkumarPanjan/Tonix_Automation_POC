package com.business.tonixPages;

import com.android.selectors.Stash_ManageStashSelectors;

public class Stash_ManageStashPage extends BasePage {

	public Stash_ManageStashPage() throws InterruptedException {
		super();
	}

	public void verifyPageLoaded() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Manage Stash ");

		waitTime(2000);
		if(verifyElementPresent(Stash_ManageStashSelectors.txtManageStash, "Manage Stash text"))
		{
			extent.extentLoggerPass("Page loaded ('Manage Stash')", "'Manage Stash' page loaded successfully");
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Manage Stash')", "'Manage Stash' page loaded successfully");
		}
	}

	public void clickWithdrawToYourTonikAccount() throws Exception {
		extent.HeaderChildNode("Click on 'Withdraw to your TONIK Account' option");
		waitTime(2000);
		if(verifyElementPresent(Stash_ManageStashSelectors.txtWithdrawToyourTONIKAccount, "Withdraw to your TONIK Account text"))
		{
			click(Stash_ManageStashSelectors.txtWithdrawToyourTONIKAccount, "Withdraw to your TONIK Account");
			extent.extentLoggerPass("'Withdraw to your TONIK Account' text click", "Clicked on 'Withdraw to your TONIK Account' text in Manage Stash page");
		}
		else
		{
			extent.extentLoggerFail("'Withdraw to your TONIK Account' text click", "Unable to click on 'Withdraw to your TONIK Account' link in Manage Stash page");
		}
	}

	public void clickStashDetails() throws Exception {
		extent.HeaderChildNode("Click on 'Stash details' option");
		waitTime(2000);
		if(verifyElementPresent(Stash_ManageStashSelectors.txtStashDetails, "'Stash details' text"))
		{
			click(Stash_ManageStashSelectors.txtStashDetails, "Stash details");
			extent.extentLoggerPass("'Stash details' text click", "Clicked on 'Stash details' text in Manage Stash page");
		}
		else
		{
			extent.extentLoggerFail("'Stash details' text click", "Unable to click on 'Stash details' link in Manage Stash page");
		}

	}

	public void clickModify() throws Exception {
		extent.HeaderChildNode("Click on 'Modify' option");
		waitTime(2000);
		if(verifyElementPresent(Stash_ManageStashSelectors.txtModify, "'Stash details' text"))
		{
			click(Stash_ManageStashSelectors.txtModify, "Modify");
			extent.extentLoggerPass("'Modify' text click", "Clicked on 'Modify' text in Manage Stash page");
		}
		else
		{
			extent.extentLoggerFail("'Modify' text click", "Unable to click on 'Modify' link in Manage Stash page");
		}

	}

	public void clickClose() throws Exception {
		extent.HeaderChildNode("Click on 'Close' option");
		waitTime(2000);
		if(verifyElementPresent(Stash_ManageStashSelectors.btnClose, "'Close' text"))
		{
			click(Stash_ManageStashSelectors.btnClose, "Modify");
			extent.extentLoggerPass("'Close' text click", "Clicked on 'Close' text in Manage Stash page");
		}
		else
		{
			extent.extentLoggerFail("'Close' text click", "Unable to click on 'Close' link in Manage Stash page");
		}

	}
}
