package com.business.tonixPages;

import com.android.selectors.Stash_CongratsGoalAchievedSelectors;
import com.android.selectors.Stash_MoneyStashSelectors;
import com.android.selectors.Stash_WootWootSelectors;

public class Stash_WootWootPage extends BasePage {
		
		public Stash_WootWootPage() throws InterruptedException {
	        super();
		}
		
		public void closePopupDoItLater() throws Exception
		{
			extent.HeaderChildNode("Money Stashed");

			if(ifElementPresent(Stash_WootWootSelectors.txtDoItLater, "Money Stashed"))
			{
				waitForElementAndClickIfPresent(Stash_WootWootSelectors.txtDoItLater, 20,"Click Done");
			}
		}

		public void verifyTimeDepositCreatedMessage() throws InterruptedException {
		if(waitForElementToBePresent(Stash_WootWootSelectors.txtWootWoot, 60, "Money stashed text"))
        {
            waitForElementToBePresent(Stash_WootWootSelectors.txtConfirmationMessage, 60, "Money Stashed");
            logger.info("Confirming money stashed");
            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
        }
        else 
        {
        	logger.info("Money not stashed");
            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
        
    }	
}
}