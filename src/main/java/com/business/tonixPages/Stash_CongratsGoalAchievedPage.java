package com.business.tonixPages;

import com.android.selectors.Stash_CongratsGoalAchievedSelectors;
import com.android.selectors.Stash_MoneyStashSelectors;

public class Stash_CongratsGoalAchievedPage extends BasePage
{
	public Stash_CongratsGoalAchievedPage() throws InterruptedException {
        super();
    }

	    /**
	     * Verify congrats goal achieved page is loaded successfully
	     * Checking if page title as congrats goal achieved is displayed
	     *
	     */

	    public void verifyCongratsGoalAchieved(String targetAmount, String stashBalance, String interestRate, String withholdingTax) throws Exception 
	    {
	        extent.HeaderChildNode("Confirm transfer to stash");
	        
	        if(ifElementPresent(Stash_MoneyStashSelectors.txtDoItLater, "Money Stashed"))
	        {
	            waitForElementAndClickIfPresent(Stash_MoneyStashSelectors.txtDoItLater, 20,"Click Done");
	        }
	        
	        if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtCongratsGoalAchieved,60, "Confirm transfer to stash text"))
	        {
		        String actualtargetAmount = getText(Stash_CongratsGoalAchievedSelectors.txtTargetAmount);
				String actualstashBalance = getText(Stash_CongratsGoalAchievedSelectors.txtStashBalance);
				dateComparisonWithoutTime();
				String actualstartingDate = getText(Stash_CongratsGoalAchievedSelectors.txtStartingDate);
				String actualinterestRate = getText(Stash_CongratsGoalAchievedSelectors.txtInterestRate);
				String actualwithholdingTax = getText(Stash_CongratsGoalAchievedSelectors.txtWithholdingTax);
				
				softAssertion.assertEquals(targetAmount, actualtargetAmount);
				System.out.println(actualtargetAmount);
				softAssertion.assertEquals(stashBalance, actualstashBalance);
				System.out.println(actualstashBalance);
				softAssertion.assertEquals(formattedDate, actualstartingDate);
				System.out.println(actualstartingDate);
				softAssertion.assertEquals(interestRate, actualinterestRate);
				System.out.println(actualinterestRate);
				softAssertion.assertEquals(withholdingTax, actualwithholdingTax);
				System.out.println(actualwithholdingTax);
				softAssertion.assertAll();
				
		        waitForElementAndClickIfPresent(Stash_CongratsGoalAchievedSelectors.btnWhatsYourNextStep, 20,"Click confirm transfer to stash");
		        
		        logger.info("Confirming transfer to stash");
		        extent.extentLoggerPass("Confirming transfer to stash", "Clicked on 'Confirm' in confirm transfer to stash page");
	        }
	        else 
	        {
	        	logger.info("Not transferred to stash");
	            extent.extentLoggerFail("Confirming transfer to stash", "Not clicked on 'Confirm' in confirm transfer to stash page");
	        
	        }
         }
	    
	    public void verifynextsteps() throws Exception 
	    {
	    	
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtNextStep, 60, "Money stashed text"))
	        {
	    		System.out.println("Next Step");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtTimeDeposit, 60, "Money stashed text"))
	        {
	    		System.out.println("Time deposit");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtHigherGoal, 60, "Money stashed text"))
	        {
	    		System.out.println("Higher Goal");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtBackToStash, 60, "Money stashed text"))
	        {
	    		System.out.println("Back to stash");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    }
	            
	    
	    public void clickConvertToTimeDeposit() throws Exception
	    {
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtTimeDeposit, 60, "Money stashed text"))
	        {
	            click(Stash_CongratsGoalAchievedSelectors.txtTimeDeposit, "Click Done");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    }
	    
	    public void clickSetHigherGoal() throws InterruptedException, Exception
	    {

	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtHigherGoal, 60, "Money stashed text"))
	        {
	            //waitForElementToBePresent(Stash_MoneyStashSelectors.btnDone, 60, "Money Stashed");
	            click(Stash_CongratsGoalAchievedSelectors.txtHigherGoal, "Click Done");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
	    }
	    
	    public void clickBackToStash() throws InterruptedException, Exception
	    {

	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtBackToStash, 60, "Money stashed text"))
	        {
	            //waitForElementToBePresent(Stash_MoneyStashSelectors.btnDone, 60, "Money Stashed");
	            click(Stash_CongratsGoalAchievedSelectors.txtBackToStash, "Click Done");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }	
	    }
	    
	    public void verifyConvertToTimeDeposit() throws InterruptedException
		   {
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtCloseStash, 60, "Money stashed text"))
	        {  
	    		System.out.println("Close Stash");
	    		logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");	
	        }
	    	
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtLeaveItAsIs, 60, "Money stashed text"))
	        {
	    		System.out.println("Leave It As Is");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }
		   }
	    
	    public void clickLeaveItAsIs() throws InterruptedException, Exception
	   {
	    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtLeaveItAsIs, 60, "Money stashed text"))
	        {
	            click(Stash_CongratsGoalAchievedSelectors.txtLeaveItAsIs, "Click Done");
	            logger.info("Confirming money stashed");
	            extent.extentLoggerPass("Confirm money stashed", "Clicked on 'Done' button in money stashed page");
	        }
	        else 
	        {
	        	logger.info("Money not stashed");
	            extent.extentLoggerFail("Confirm money stashed", "Not clicked on 'Done' button in money stashed page");
	        
	    }	  
	   }
	    
	    public void clickCloseStash() throws InterruptedException, Exception
		   {
		    	if(waitForElementToBePresent(Stash_CongratsGoalAchievedSelectors.txtCloseStash, 60, "Money stashed text"))
		        {
		            //waitForElementToBePresent(Stash_MoneyStashSelectors.btnDone, 60, "Money Stashed");
		            click(Stash_CongratsGoalAchievedSelectors.txtCloseStash, "Click Done");
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
