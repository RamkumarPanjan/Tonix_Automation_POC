package com.business.tonixPages;

import com.android.selectors.Stash_StashHomeSelectors;

public class Stash_StashHomePage extends BasePage {

	public Stash_StashHomePage() throws InterruptedException {
		super();
	}

	public void clickStartANewStash() throws Exception {
		extent.HeaderChildNode("Click on Start a new stash");
		waitTime(2000);
		if(verifyElementPresent(Stash_StashHomeSelectors.txtStartNewStash, "stashes text"))
		{
			click(Stash_StashHomeSelectors.txtStartNewStash, "Start a new stash");
			extent.extentLoggerPass("Start a new stash", "Clicked on 'Start a new stash' text in main page");
		}
		else
		{
			extent.extentLoggerFail("Start a new stash", "Unable to click on 'Start a new stash' link in stash home page");
		}
	}

	public void clickManage() throws Exception {
		extent.HeaderChildNode("Click on 'Manage' text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StashHomeSelectors.txtManage, "Manage text"))
		{
			click(Stash_StashHomeSelectors.txtManage, "Manage stash");
			extent.extentLoggerPass("Manage stash", "Clicked on 'Manage' text in stash main page");
		}
		else
		{
			extent.extentLoggerFail("Manage stash", "Unable to click on 'Manage' link in stash home page");
		}
	}

	public void clickAddToStash() throws Exception {
		extent.HeaderChildNode("Click on 'Add to stash' text");
		waitTime(2000);
        if(ifElementPresent(Stash_StashHomeSelectors.txtAddToStash, "'Add to Stash' text")) {
            waitForElementAndClickIfPresent(Stash_StashHomeSelectors.txtAddToStash, 20,"Click 'Add to Stash' text in add to stash page");
            logger.info("Adding to stash");
            extent.extentLoggerPass("Add to Stash", "Clicked on 'Add to Stash' text in add to stash page");
        }
        else {
            logger.info("Popup is not displayed");
            extent.extentLoggerFail("Allow popup", "Allow popup not displayed");
        }
	}
}
