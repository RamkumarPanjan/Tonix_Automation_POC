package com.business.tonixPages;

import com.android.selectors.Stash_CongratsGoalAchievedSelectors;
import com.android.selectors.Stash_SetUpTimeDepositSelectors;

public class Stash_SetUpTimeDepositPage extends BasePage{
	
	public Stash_SetUpTimeDepositPage() throws InterruptedException {
        super();
	}

	public void verifySetUpTimeDeposit(String investmentAmount, String termTimeDeposit, String nicknameTimeDeposit, String interestRateTimeDeposit, String interestEarnedAtMaturity, String payoutAtMaturity, String earlyWithdrawal) throws Exception {
		
		if(waitForElementToBePresent(Stash_SetUpTimeDepositSelectors.txtSetUpTimeDeposit,60, "Confirm transfer to stash text"))
        {
	        String actualinvestmentAmount = getText(Stash_SetUpTimeDepositSelectors.txtInvestmentAmount);
	        System.out.println(actualinvestmentAmount);
			String actualterm = getText(Stash_SetUpTimeDepositSelectors.txtTerm);
			System.out.println(actualterm);
			String actualnickname = getText(Stash_SetUpTimeDepositSelectors.txtNickname);
			System.out.println(actualnickname);
			String actualinterestRate = getText(Stash_SetUpTimeDepositSelectors.txtInterestRate);
			System.out.println(actualinterestRate);
			String actualinterestEarnedAtMaturity = getText(Stash_SetUpTimeDepositSelectors.txtInterestEarnedAtMaturity);
			System.out.println(actualinterestEarnedAtMaturity);
			String actualpayoutAtMaturity = getText(Stash_SetUpTimeDepositSelectors.txtPayoutAtMaturity);
			System.out.println(actualpayoutAtMaturity);
			String actualearlyWithdrawal = getText(Stash_SetUpTimeDepositSelectors.txtEarlyWithdrawal);
			System.out.println(actualearlyWithdrawal);
			dateComparisonWithoutTimeAndFutureDates(6);
			String actualdateOfMaturity = getText(Stash_SetUpTimeDepositSelectors.txtDateOfMaturity);
			System.out.println(actualdateOfMaturity);
			System.out.println("--------------------");
			
			softAssertion.assertEquals(investmentAmount, actualinvestmentAmount);
			System.out.println(actualinvestmentAmount);
			softAssertion.assertEquals(termTimeDeposit, actualterm);
			System.out.println(actualterm);
			softAssertion.assertEquals(nicknameTimeDeposit, actualnickname);
			System.out.println(actualnickname);
			softAssertion.assertEquals(interestRateTimeDeposit, actualinterestRate);
			System.out.println(actualinterestRate);
			softAssertion.assertEquals(interestEarnedAtMaturity, actualinterestEarnedAtMaturity);
			System.out.println(actualinterestEarnedAtMaturity);
			softAssertion.assertEquals(payoutAtMaturity, actualpayoutAtMaturity);
			System.out.println(actualpayoutAtMaturity);
			softAssertion.assertEquals(earlyWithdrawal, actualearlyWithdrawal);
			System.out.println(actualearlyWithdrawal);
			softAssertion.assertEquals(formattedDate, actualdateOfMaturity);
			System.out.println(actualdateOfMaturity);
			softAssertion.assertAll();
			Swipe("up", 1);
			
	        waitForElementAndClickIfPresent(Stash_SetUpTimeDepositSelectors.btnTermsAndConditions, 20,"Click confirm transfer to stash");
	        waitForElementAndClickIfPresent(Stash_SetUpTimeDepositSelectors.btnLetUsOpenThisTimeDeposit, 20,"Click confirm transfer to stash");
	        
	        logger.info("Confirming transfer to stash");
	        extent.extentLoggerPass("Confirming transfer to stash", "Clicked on 'Confirm' in confirm transfer to stash page");
        }
        else 
        {
        	logger.info("Not transferred to stash");
            extent.extentLoggerFail("Confirming transfer to stash", "Not clicked on 'Confirm' in confirm transfer to stash page");
        
        }

	        
	}
}
