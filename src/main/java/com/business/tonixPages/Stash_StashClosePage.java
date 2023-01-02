package com.business.tonixPages;

import com.android.selectors.Stash_StashCloseSelectors;

public class Stash_StashClosePage extends BasePage{
	
	public Stash_StashClosePage() throws InterruptedException {
		super();	
	}
	
	public void brokeTheStash() throws Exception {
		extent.HeaderChildNode("Confirmation Broke the Stash Page");
		
		waitTime(2000);
		explicitWaitVisibility(Stash_StashCloseSelectors.txtBrokeTheStash, 10);
		if(verifyElementPresent(Stash_StashCloseSelectors.txtBrokeTheStash, getText(Stash_StashCloseSelectors.txtBrokeTheStash)))
		{
			explicitWaitVisibility(Stash_StashCloseSelectors.txtJustKiddingYouHaveClosedIt, 10);
			verifyElementPresent(Stash_StashCloseSelectors.txtJustKiddingYouHaveClosedIt, getText(Stash_StashCloseSelectors.txtJustKiddingYouHaveClosedIt));
			
			click(Stash_StashCloseSelectors.btnDone, "Done button");
			extent.extentLoggerPass("Broke the Stash succesfully", "Broke the Stash is displayed and Clicked on Done button in Close Stash page");
		}
		else
		{
			extent.extentLoggerFail("Broke the Stash", "You broke the Stash Text in Close Stash page");
		}

		
		
	}
}
