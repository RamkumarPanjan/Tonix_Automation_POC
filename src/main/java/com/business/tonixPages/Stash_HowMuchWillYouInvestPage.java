package com.business.tonixPages;

import com.android.selectors.Stash_CongratsGoalAchievedSelectors;
import com.android.selectors.Stash_HowMuchWillYouInvestSelectors;
import com.android.selectors.Stash_WithdrawConfirmationSelectors;

public class Stash_HowMuchWillYouInvestPage extends BasePage {
	
	public Stash_HowMuchWillYouInvestPage() throws InterruptedException {
		super();
	}
	/**
	 * This Business Method is for confirmation of the Updated Stash Details 
	 * @return 
	 * @throws Exception
	 */

	public void verifyHowMuchWillYouInvest() throws InterruptedException, Exception
	   {    
		    Thread.sleep(12000);
	    	if(waitForElementToBePresent(Stash_HowMuchWillYouInvestSelectors.txtHowMuchWillYouInvest, 60, "Money stashed text"))
	        {
	         
	            click(Stash_HowMuchWillYouInvestSelectors.btnIAmInterested, "Click Done");
	            Thread.sleep(10000);
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }	
	   }	
	
	  public void verifyConfirmationMessage(String mailid) throws InterruptedException, Exception
	   {
		    extent.HeaderChildNode("Withdrawal Confirmation: Confirmation message verification");

			String actualMessage = getText(Stash_HowMuchWillYouInvestSelectors.txtVerificationLink);
			String actualFormattedMessage = actualMessage.replaceAll("\\s+", " ");
			String expectedMessage = "A verification link will be sent to "+mailid+". Do you want to verify now? If it were me, every OTP will start with 1 4 3";                                           
			softAssertion.assertEquals(actualFormattedMessage, expectedMessage);
			softAssertion.assertAll();
			System.out.println(actualFormattedMessage);
		}
	   
}
