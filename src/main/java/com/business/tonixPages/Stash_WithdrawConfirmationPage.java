package com.business.tonixPages;

import com.android.selectors.Stash_WithdrawConfirmationSelectors;

public class Stash_WithdrawConfirmationPage extends BasePage {

	public Stash_WithdrawConfirmationPage() throws InterruptedException {
		super();
	}

	public void verifyPageLoaded() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Withdraw from your Stash ");

		waitTime(2000);
		if(verifyElementPresent(Stash_WithdrawConfirmationSelectors.txtConfirmationTitle, "Withdrawal Confirmation text"))
		{
			extent.extentLoggerPass("Page loaded ('Withdrawal Confirmation')", "'Withdrawal Confirmation' page loaded successfully");
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Withdrawal Confirmation')", "'Withdrawal Confirmation' page loaded successfully");
		}
	}

	public void verifyConfirmationMessage(String withdrawalAmount, String stashType) throws Exception {
		extent.HeaderChildNode("Withdrawal Confirmation: Confirmation message verification");

		String actualMessage = getText(Stash_WithdrawConfirmationSelectors.txtConfirmationMessage);
		String expectedMessage = "You moved "+withdrawalAmount+" from "+stashType+" to your Tonik account. Now you’ve got cash. Date night?";
		softAssertion.assertEquals(actualMessage, expectedMessage);

		System.out.println("===> actualMessage: "+actualMessage);
		click(Stash_WithdrawConfirmationSelectors.btnOhYeah, "Oh Yeah!");
	}

}
