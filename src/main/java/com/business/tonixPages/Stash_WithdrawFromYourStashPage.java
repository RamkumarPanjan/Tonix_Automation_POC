package com.business.tonixPages;

import com.android.selectors.LoginSelectors;
import com.android.selectors.Stash_WithdrawFromYourStashSelectors;

public class Stash_WithdrawFromYourStashPage extends BasePage {

	public Stash_WithdrawFromYourStashPage() throws InterruptedException {
		super();
	}

	public void verifyPageLoaded() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Withdraw from your Stash ");

		waitTime(2000);
		if(verifyElementPresent(Stash_WithdrawFromYourStashSelectors.txtWithDrawFromYourStash, "Withdraw from your Stash text"))
		{
			extent.extentLoggerPass("Page loaded ('Withdraw from your stash')", "'Withdraw from your Stash' page loaded successfully");
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Withdraw from your stash')", "'Withdraw from your Stash' page loaded successfully");
		}
	}

	public void withDrawAmount(String amount) throws Exception {
		extent.HeaderChildNode("Withdraw amount");
		waitTime(2000);

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
		isButtonClickable = getAttributValue("clickable", Stash_WithdrawFromYourStashSelectors.btnWithdraw);
		waitForElementAndClickIfPresent(Stash_WithdrawFromYourStashSelectors.btnWithdraw, 20,"Withdraw");
		waitTime(2000);
	}
}
