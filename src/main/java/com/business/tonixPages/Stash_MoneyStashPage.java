package com.business.tonixPages;

import com.android.selectors.Stash_MoneyStashSelectors;

public class Stash_MoneyStashPage extends BasePage 
{

		public Stash_MoneyStashPage() throws InterruptedException {
	        super();
	    }

		    /**
		     * Verify Money stash page is loaded successfully
	         * Checking if Money Stash text is displayed
		     *
		     */

		    public void moneyStashed() throws Exception
		    {
		        extent.HeaderChildNode("Money Stashed");
		        
		        if(ifElementPresent(Stash_MoneyStashSelectors.txtDoItLater, "Money Stashed"))
		        {
		            waitForElementAndClickIfPresent(Stash_MoneyStashSelectors.txtDoItLater, 20,"Click Done");
		        }
		        
		        if(waitForElementToBePresent(Stash_MoneyStashSelectors.txtMoneyStashed, 60, "Money stashed text"))
		        {
		            //waitForElementToBePresent(Stash_MoneyStashSelectors.btnDone, 60, "Money Stashed");
		            waitForElementAndClickIfPresent(Stash_MoneyStashSelectors.btnDone, 20,"Click Done");
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

