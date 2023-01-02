package com.business.tonixPages;

import com.android.selectors.Stash_MoneyStashSelectors;

public class Stash_MoneyStashPage extends BasePage {

		public Stash_MoneyStashPage() throws InterruptedException {
	        super();
	    }

		    /**
		     * Business method for RingPay Application Launch
		     *
		     */

		    public void moneyStashed() throws Exception {
		        extent.HeaderChildNode("Money Stashed");
		        
		        if(ifElementPresent(Stash_MoneyStashSelectors.txtDoItLater, "Money Stashed")) {
		            waitForElementAndClickIfPresent(Stash_MoneyStashSelectors.txtDoItLater, 20,"Click Done");
		        }
		        explicitWaitVisibility(Stash_MoneyStashSelectors.txtMoneyStashed,120);
		        
		        if(ifElementPresent(Stash_MoneyStashSelectors.btnDone, "Money Stashed")) {
		            waitForElementAndClickIfPresent(Stash_MoneyStashSelectors.btnDone, 20,"Click Done");
		            logger.info("Confirming money stashed");
		            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
		        }
		        else {
		        	logger.info("Money not stashed");
		            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
		        
		        }
	}
	}

