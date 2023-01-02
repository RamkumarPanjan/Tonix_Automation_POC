package com.business.tonixPages;

import com.android.selectors.Stash_ReviewStashDetailsSelectors;
import com.android.selectors.Stash_SoloStashCreatedSelectors;
import com.android.selectors.Stash_StartNewStashSelectors;

public class Stash_SoloStashCreatedPage extends BasePage {
	
	public Stash_SoloStashCreatedPage() throws InterruptedException {
		super();
	}
	
	public void soloStashCreated() throws Exception {
		extent.HeaderChildNode("Solo Stash created Successfully");
		waitTime(2000);
		explicitWaitVisibility(Stash_SoloStashCreatedSelectors.txtSoloStashCreated,10);
		if(verifyElementPresent(Stash_SoloStashCreatedSelectors.txtSoloStashCreated, getText(Stash_SoloStashCreatedSelectors.txtSoloStashCreated)))
		{
			explicitWaitVisibility(Stash_SoloStashCreatedSelectors.txtAddManyMore, 10);
			verifyElementPresent(Stash_SoloStashCreatedSelectors.txtAddManyMore, getText(Stash_SoloStashCreatedSelectors.txtAddManyMore));

			verifyElementPresentAndClick(Stash_SoloStashCreatedSelectors.btnDone, "Done button");
			logger.info("Solo stash is created successfully");
			extent.extentLoggerPass("Solo Stash created Successfully", "Solo Stash created text is displayed and Clicked on Done button in Solo stash created  page");
		}
		else
		{
			extent.extentLoggerFail("Solo Stash created Successfully", "Solo Stash created text is not displayed in Solo stash created  page");
		}
		
	}

}
