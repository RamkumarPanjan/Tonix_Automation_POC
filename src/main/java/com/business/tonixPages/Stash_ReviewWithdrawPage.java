package com.business.tonixPages;

import com.android.selectors.Stash_ReviewWithdrawalSelectors;

public class Stash_ReviewWithdrawPage extends BasePage {

	public Stash_ReviewWithdrawPage() throws InterruptedException {
		super();
	}

	public void verifyPageLoaded() throws Exception {
		extent.HeaderChildNode("Page loaded verification: Withdraw from your Stash ");

		waitTime(2000);
		if(verifyElementPresent(Stash_ReviewWithdrawalSelectors.txtReviewWithdrawal, "Review Withdrawal text"))
		{
			extent.extentLoggerPass("Page loaded ('Review Withdrawal')", "'Review Withdrawal' page loaded successfully");
		}
		else
		{
			extent.extentLoggerFail("Page not loaded ('Review Withdrawal')", "'Review Withdrawal' page loaded successfully");
		}
	}

	public void reviewWithdrawalInfo(String withdrawalAmount, String stashType, String toAccount) throws Exception {
		extent.HeaderChildNode("Review withdrawal amount");
		waitTime(2000);

		this.verifyPageLoaded();

		String isButtonClickable = getAttributValue("clickable", Stash_ReviewWithdrawalSelectors.btnConfirm);

		String actualWithdrawalAmount = getText(Stash_ReviewWithdrawalSelectors.txtAmountValue);
		String actualStashType = getText(Stash_ReviewWithdrawalSelectors.txtFromValue);
		String actualToAccount = getText(Stash_ReviewWithdrawalSelectors.txtToValue);
		softAssertion.assertEquals(withdrawalAmount, actualWithdrawalAmount);
		softAssertion.assertEquals(stashType, actualStashType);
		softAssertion.assertEquals(toAccount, actualToAccount);

		click(Stash_ReviewWithdrawalSelectors.btnConfirm, "Confirm");
		waitTime(2000);
	}
}
