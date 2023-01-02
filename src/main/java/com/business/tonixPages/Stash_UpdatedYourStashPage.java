package com.business.tonixPages;

import com.android.selectors.Stash_StartNewStashSelectors;
import com.android.selectors.Stash_UpdateYourStashSelectors;

public class Stash_UpdatedYourStashPage extends BasePage {
	
	public Stash_UpdatedYourStashPage() throws InterruptedException {
		super();
	}
	
	public void updatedYourStash() throws Exception {
		extent.HeaderChildNode("You Updated Your Stash");
		
		logger.info("After Modifying Stash Details Updated Stash Successfully Page ");
		
		explicitWaitVisibility(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash, 10);
		waitTime(2000);
		if(verifyElementPresent(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash, getText(Stash_UpdateYourStashSelectors.txtYourUpdatedYourStash)))
		{
			explicitWaitVisibility(Stash_UpdateYourStashSelectors.txtThanksForUpdating,10);
			verifyElementPresent(Stash_UpdateYourStashSelectors.txtThanksForUpdating, getText(Stash_UpdateYourStashSelectors.txtThanksForUpdating));
			click(Stash_UpdateYourStashSelectors.btnDone, "Done button"); 
			extent.extentLoggerPass("You Updated Your Stash", "Clicked on You Updated Your Stash in Updated stash  page");
		}
		else
		{
			extent.extentLoggerFail("You Updated Your Stash", "Unabled to click on Done button in Updated stash  page");
		}
	}
	
	}
