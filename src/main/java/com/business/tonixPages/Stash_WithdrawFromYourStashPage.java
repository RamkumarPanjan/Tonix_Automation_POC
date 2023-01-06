package com.business.tonixPages;

import com.android.selectors.LoginSelectors;
import com.android.selectors.Stash_WithdrawFromYourStashSelectors;

public class Stash_WithdrawFromYourStashPage extends BasePage {

	public Stash_WithdrawFromYourStashPage() throws InterruptedException {
		super();
	}

	/**
	 * Verify Withdraw from your stash is loaded successfully
	 * Checking if Withdraw from your stash text is displayed
	 */
	public boolean verifyPageLoaded() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Withdraw from your Stash ");

		waitTime(2000);
		if(waitForElementToBePresent(Stash_WithdrawFromYourStashSelectors.txtWithDrawFromYourStash, 60,"Withdraw from your Stash text"))
		{
			extent.extentLoggerPass("Page loaded ('Withdraw from your stash')", "'Withdraw from your Stash' page loaded successfully");
			return true;
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Withdraw from your stash')", "'Withdraw from your Stash' page loaded successfully");
			return false;
		}
	}

	/**
	 * Enter the amount in withdraw amount edit field and click on Withdraw button
	 * Parameters
	 * 		amount - e.g. 500, 1000
	 */
	public void withDrawAmount(String amount) throws Exception {
		extent.HeaderChildNode("Withdraw amount");
		waitTime(2000);

		if(this.verifyPageLoaded()) {
			String isButtonClickable = getAttributValue("clickable", Stash_WithdrawFromYourStashSelectors.btnWithdraw);
			if(isButtonClickable.equals("false")) {
				extent.extentLoggerPass("Withdraw button", "'Withdraw' button is disabled");
			}
			else {
				extent.extentLoggerFail("Withdraw button", "'Withdraw' button is enabled");
			}

			click(Stash_WithdrawFromYourStashSelectors.edtWithDrawableAmount, "Withdraw amount edit field");
			hideKeyboard();
			type(Stash_WithdrawFromYourStashSelectors.edtWithDrawableAmount  , amount, "Withdraw amount");
			waitTime(2000);
			waitForElementAndClickIfPresent(Stash_WithdrawFromYourStashSelectors.btnWithdraw, 20,"Withdraw");
			waitTime(2000);
		}
	}
}
