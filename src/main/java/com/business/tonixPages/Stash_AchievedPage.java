package com.business.tonixPages;

import com.android.selectors.Stash_AchievedSelectors;

public class Stash_AchievedPage extends BasePage
{
	public Stash_AchievedPage() throws InterruptedException
	{
        super();
    }

	    /**
	     * Verify congrats goal achieved page is loaded successfully
	     * Checking if page title as congrats goal achieved is displayed
	     *
	     */
	public void verifyAchievedStashMessage(String achievedAmount, String targetAmount) throws Exception {
		//extent.HeaderChildNode("Balance text verification");
		    if(waitForElementToBePresent(Stash_AchievedSelectors.txtStashName, 10, "Balance amount text message")) 
		    {
			String actualachievedAmount= getText(Stash_AchievedSelectors.txtAchieved);
			String expectedachievedAmount = "Achieved "+achievedAmount+"";
			softAssertion.assertEquals(actualachievedAmount, expectedachievedAmount);
			String actualtargetAmount= getText(Stash_AchievedSelectors.txtTarget);
			String expectedtargetAmount = "Achieved "+targetAmount+"";
			softAssertion.assertEquals(actualtargetAmount, expectedtargetAmount);
			softAssertion.assertAll();
			
		} 
		    else
		    {
			extent.extentLoggerFail("Message - No enough balance in Stash account", "'No enough balance in Stash account' is not displayed");
		    }
	}

}