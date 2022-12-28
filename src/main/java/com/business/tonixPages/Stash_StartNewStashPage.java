package com.business.tonixPages;

import com.android.selectors.Stash_StartNewStashSelectors;
import com.android.selectors.Stash_StashHomeSelectors;


public class Stash_StartNewStashPage extends BasePage {
	
	public Stash_StartNewStashPage() throws InterruptedException {
		super();
	}
	
	public void clickOpenANewStash() throws Exception {
		
		
		extent.HeaderChildNode("Click on 'Open a New Stash' text");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtOpenNewStash, "Open a New Stash text"))
		{
			click(Stash_StartNewStashSelectors.txtOpenNewStash, "Open a New Stash");
			extent.extentLoggerPass("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Open a New Stash", "Clicked on Open a New Stash text in Start New stash  page");
		}
	}
	
	
	public void selectStashType() throws Exception {
		
		extent.HeaderChildNode("Select Stash Type");
		waitTime(2000);
		if(verifyElementPresent(Stash_StartNewStashSelectors.txtSelectStashType, "Select stash Type"))
		{		
		explicitWaitVisibility(Stash_StartNewStashSelectors.txtSelectStashType, 10);
		verifyElementPresent(Stash_StartNewStashSelectors.txtSelectStashType, "Select stash Type");
		verifyElementPresentAndClick(Stash_StartNewStashSelectors.txtSoloStash, "Solo stash Text");
		logger.info("Select stash type pop-up is displayed");
		extent.extentLoggerPass("Select Stash type", "select Stash Type text in Start New stash  page");
		}
		else
		{
			extent.extentLoggerFail("Select Stash type", "select Stash Type text in Start New stash  page");
		}
	
		
	}
}
