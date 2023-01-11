package com.business.tonixPages;

import com.android.selectors.Stash_UpdateYourStashSelectors;

public class Stash_UpdatedYourStashPage extends BasePage {
	
	public Stash_UpdatedYourStashPage() throws InterruptedException {
		super();
	}
	/**
	 * This Business Method is for confirmation of the Updated Stash Details 
	 * @throws Exception
	 */

	public void verifyUpdatedStashConfirmationMessage() throws Exception {
		extent.HeaderChildNode("You Updated Your Stash page");
		logger.info("After Modifying Stash Details Updated Stash Successfully Page ");
		waitTime(2000);

		if(waitForElementToBePresent(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash,120,"You updated your stash text")) {
			String actualMessage = getText(Stash_UpdateYourStashSelectors.txtThanksForUpdating);
			String expectedMessage = "\"Update\" when you go out with someone who is better looking than you. Thanks for updating.";
			softAssertion.assertEquals(actualMessage, expectedMessage);
			softAssertion.assertAll();
			if(verifyElementPresent(Stash_UpdateYourStashSelectors.btnDone, "Done button is displayed")) {
				click(Stash_UpdateYourStashSelectors.btnDone, "Done button");
				extent.extentLoggerPass("You Updated Your Stash", "Clicked on You Updated Your Stash in Updated stash  page");
			}
			else {
				extent.extentLoggerFail("You Updated Your Stash", "Unable to click on Done button in Updated stash  page");
			}
		} else {
			extent.extentLoggerFail("You Updated Your Stash page", "Page not loaded successfully: 'You Updated Your Stash'");
		}
	}
}
