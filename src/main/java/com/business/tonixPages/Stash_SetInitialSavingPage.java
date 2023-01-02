package com.business.tonixPages;

import com.android.selectors.Stash_SetInitialSavingSelectors;


public class Stash_SetInitialSavingPage extends BasePage {
	
	public Stash_SetInitialSavingPage() throws InterruptedException {
		super();
		
	}

	public void clickOnSkipForNow() throws Exception {
		extent.HeaderChildNode("Click on Skip For Now Option");
		waitTime(2000);
		explicitWaitVisibility(Stash_SetInitialSavingSelectors.txtSkipForNow, 10);
		if(verifyElementPresent(Stash_SetInitialSavingSelectors.txtSkipForNow, "Skip For Now text"))
		{
			click(Stash_SetInitialSavingSelectors.txtSkipForNow, "Skip For Now text");
			extent.extentLoggerPass("Skip For Now text", "Clicked on Skip For Now text in Set Intial Saving page");
		}
		else
		{
			extent.extentLoggerFail("Skip For Now text", "Clicked on Skip For Now text in Set Intial Saving page");
		}

	}
}
