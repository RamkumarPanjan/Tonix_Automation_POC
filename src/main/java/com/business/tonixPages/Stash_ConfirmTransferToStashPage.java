package com.business.tonixPages;

import com.android.selectors.Stash_ConfirmTransferToStashSelectors;

public class Stash_ConfirmTransferToStashPage extends BasePage {

	public Stash_ConfirmTransferToStashPage() throws InterruptedException {
        super();
    }

	    /**
	     * Business method for RingPay Application Launch
	     *
	     */

	    public void confirmTransferToStash() throws Exception {
	        extent.HeaderChildNode("Confirm transfer to stash");
	        
	        
	        explicitWaitVisibility(Stash_ConfirmTransferToStashSelectors.txtConfirmTransferToStash,120);
	        if(ifElementPresent(Stash_ConfirmTransferToStashSelectors.btnConfirm, "Confirm transfer to stash")) {
	            waitForElementAndClickIfPresent(Stash_ConfirmTransferToStashSelectors.btnConfirm, 20,"Click confirm transfer to stash");
	            logger.info("Confirming transfer to stash");
	            extent.extentLoggerPass("Confirming transfer to stash", "Clicked on 'Confirm' in confirm transfer to stash page");
	        }
	        else {
	        	logger.info("Not transferred to stash");
	            extent.extentLoggerFail("Confirming transfer to stash", "Not clicked on 'Confirm' in confirm transfer to stash page");
	        
	        }
}
}