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

	public void updatedYourStash() throws Exception 
	{
		extent.HeaderChildNode("You Updated Your Stash");
		logger.info("After Modifying Stash Details Updated Stash Successfully Page ");

		waitTime(2000);
		if(verifyElementPresent(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash, "Updated Your Stash text"))
		{
			String actualMessageupdatedYourStash = getText(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash);
			System.out.println(actualMessageupdatedYourStash);
			verifyElementPresent(Stash_UpdateYourStashSelectors.txtThanksForUpdating, "Thanks For Updating text");
			String actualMessageThanksForUpdating = getText(Stash_UpdateYourStashSelectors.txtThanksForUpdating);
			System.out.println(actualMessageThanksForUpdating);
		}
		if(verifyElementPresent(Stash_UpdateYourStashSelectors.btnDone, "Done button is displayed"))
		{
			click(Stash_UpdateYourStashSelectors.btnDone, "Done button");
			extent.extentLoggerPass("You Updated Your Stash", "Clicked on You Updated Your Stash in Updated stash  page");
		}
		else
		{
			extent.extentLoggerFail("You Updated Your Stash", "Unable to click on Done button in Updated stash  page");
		}
	}
}
