package com.business.tonixPages;

import com.android.selectors.Stash_ConfirmTransferToStashSelectors;
import com.android.selectors.Stash_ReviewWithdrawalSelectors;
import com.android.selectors.Stash_WithdrawConfirmationSelectors;

public class Stash_ConfirmTransferToStashPage extends BasePage {

	public Stash_ConfirmTransferToStashPage() throws InterruptedException {
        super();
    }

	    /**
	     * Business method for RingPay Application Launch
	     *
	     */

	    public void confirmTransferToStash(String editAmount, String fromAccount, String stashType, String stashOwner) throws Exception {
	        extent.HeaderChildNode("Confirm transfer to stash");
	        
	        explicitWaitVisibility(Stash_ConfirmTransferToStashSelectors.txtConfirmTransferToStash,120); 
	        String actualeditAmount = getText(Stash_ConfirmTransferToStashSelectors.txtAmount).substring(1);
			String actualfromAccount = getText(Stash_ConfirmTransferToStashSelectors.txtFrom);
			String actualtoStashType = getText(Stash_ConfirmTransferToStashSelectors.txtTo);
			String actualstashOwner = getText(Stash_ConfirmTransferToStashSelectors.txtStashOwner);
			softAssertion.assertEquals(editAmount, actualeditAmount);
			System.out.println(actualeditAmount);
			softAssertion.assertEquals(fromAccount, actualfromAccount);
			System.out.println(actualfromAccount);
			softAssertion.assertEquals(stashType, actualtoStashType);
			System.out.println(actualtoStashType);
			softAssertion.assertEquals(stashOwner, actualstashOwner);
			System.out.println(actualstashOwner);
			softAssertion.assertAll();
			
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