package com.business.tonixPages;

import com.android.selectors.MainSelectors;
import com.android.selectors.Stash_ManageStashselectors;
import com.android.selectors.Stash_StashHomeSelectors;
import com.android.selectors.Stash_StashSetupSelectors;

public class StashHomePage extends BasePage {

	public StashHomePage() throws InterruptedException {
		super();
	}

	public void stashHomePageTest() throws Exception {

		extent.HeaderChildNode("Different stashes Flow");

		explicitWaitVisibility(MainSelectors.txtYourTonikAccount, 10);
		verifyElementPresent(MainSelectors.txtYourTonikAccount,"Your Tonik Account text");
		Swipe("up", 1);

		waitTime(2000);

			explicitWaitVisibility(MainSelectors.txtStashes, 10);

		if(	verifyElementPresent(MainSelectors.txtStashes, "stashes text"))
		{
			click(MainSelectors.txtStashes, " stashes text");
		}
		/*	explicitWaitVisibility(StashHomePageSelectors.objIndividualstashTxt, 10);
		verifyElementPresent(StashHomePageSelectors.objIndividualstashTxt, getTextVal(StashHomePageSelectors.objIndividualstashTxt, "text"));
		click(StashHomePageSelectors.objAlrightBtn,"Alright button");

		explicitWaitVisibility(StashHomePageSelectors.objIDeserveStashTxt, 10);
		verifyElementPresent(StashHomePageSelectors.objIDeserveStashTxt, getTextVal(StashHomePageSelectors.objIDeserveStashTxt, "text"));
		click(StashHomePageSelectors.objAmazingBtn,"Amazing button");

		explicitWaitVisibility(StashHomePageSelectors.objReboundStashtxt, 10);
		verifyElementPresent(StashHomePageSelectors.objReboundStashtxt, getTextVal(StashHomePageSelectors.objReboundStashtxt, "text"));
		click(StashHomePageSelectors.objReallBtn,"Really? button");

		explicitWaitVisibility(StashHomePageSelectors.objGoalsStashTxt, 10);
		verifyElementPresent(StashHomePageSelectors.objGoalsStashTxt, getTextVal(StashHomePageSelectors.objGoalsStashTxt, "text"));
		click(StashHomePageSelectors.objCoolBtn,"Cool! button");

		explicitWaitVisibility(StashHomePageSelectors.objWerkitstashtxt, 10);
		verifyElementPresent(StashHomePageSelectors.objWerkitstashtxt, getTextVal(StashHomePageSelectors.objWerkitstashtxt, "text"));
		click(StashHomePageSelectors.objLetsstartStashingBtn,"Let's start stashing button");*/


		else
		{
			logger.info("stash balance");
			waitTime(3000);
			explicitWaitVisibility(MainSelectors.txtTotalStashBalance,10);
			if(verifyElementPresent(MainSelectors.txtTotalStashBalance, "Total Stash balance text")) {
				waitForElementAndClickIfPresent(MainSelectors.txtTotalStashBalance, 20,"Click Total Stash balance text");
				logger.info("Total Stash balance text");
				extent.extentLoggerPass("Total Stash balance", "Clicked on Total Stash balance");
			}
			else{
				logger.info("Popup is not displayed");
				extent.extentLoggerFail("Allow popup", "Allow popup not displayed");
			}
		}

			explicitWaitVisibility(Stash_StashHomeSelectors.txtStartNewStash, 10);
		verifyElementPresent(Stash_StashHomeSelectors.txtStartNewStash, "start a new stash text");
		click(Stash_StashHomeSelectors.txtStartNewStash,"start a new stash text");
		click(Stash_StashHomeSelectors.txtStartNewStash,"start a new stash text");

	
	}
}
