package com.business.tonixPages;

import com.android.selectors.Stash_AddToStashSelectors;

public class Stash_AddToStashPage extends BasePage {

	    public Stash_AddToStashPage() throws InterruptedException {
	        super();
	    }

	    /**
	     * Verify Add to stash page is loaded successfully
	     * Entering the edit amount eg:500
	     * 
	     */

	    public void addToStash(String stashAmount) throws Exception 
	    {
	        extent.HeaderChildNode("Add to stash");
	        Thread.sleep(5000);
	        waitForElementToBePresent(Stash_AddToStashSelectors.txtAddToStashh, 60, "Add to stash text");
	        Thread.sleep(5000);
	        
	        if(ifElementPresent(Stash_AddToStashSelectors.txtBalance, "'Balance' text")) 
	        {
            	//verifyElementPresent(Stash_AddToStashSelectors.txtBalance,"Balance text");
	        }
	        else 
	        {
	        	logger.info("Balance text not present");
	            extent.extentLoggerFail("Balance", "Not present in add to stash page");
	        }
	        
	        if(verifyElementPresent(Stash_AddToStashSelectors.edtAmount, "Edit amount")) 
	        {
	            //String camPermHeaderTxt = getText(Stash_AddToStashSelectors.edtAddToStash);
	            Thread.sleep(5000);
	            click(Stash_AddToStashSelectors.edtAmount, "click on edit amount");
	            type(Stash_AddToStashSelectors.edtAmount  ,stashAmount, "Enter amount");
	            hideKeyboard();
	            waitForElementAndClickIfPresent(Stash_AddToStashSelectors.btnNextt, 20,"click next button in add to stash");
	            logger.info("Adding to stash");
	            extent.extentLoggerPass("Add to Stash", "Clicked on 'Add to Stash' text in add to stash page");
	        }
	        else
	        {
	            logger.info("Not added to stash");
	            extent.extentLoggerFail("Add to Stash", "Not clicked on 'Add to stash' text in add to stash page");
	        }
	    }
	}