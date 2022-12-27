package com.business.tonixPages;

import com.android.selectors.MainSelectors;
import org.testng.Assert;

public class MainPage extends BasePage {

    public MainPage() throws InterruptedException {
        super();
    }

    /**
     * Business method for RingPay Application Launch
     *
     */

    public void clickTotalStashBalance() throws Exception {
        extent.HeaderChildNode("Clicking Total Stash Balance");

        explicitWaitVisibility(MainSelectors.txtYourTonikAccount,120);
        if(ifElementPresent(MainSelectors.txtStashes, "'Stashes' text")) {
            waitForElementAndClickIfPresent(MainSelectors.txtStashes, 20,"Click 'Stashes' text in main page");
            extent.extentLoggerPass("Total Stash balance", "Clicked on 'Stashes' text in main page");
        }
        else if(ifElementPresent(MainSelectors.txtPutYourStashInCash, "'Put your stash in cash' text")) {
            waitForElementAndClickIfPresent(MainSelectors.txtPutYourStashInCash, 20,"Click 'Put your stash in cash' text in main page");
            extent.extentLoggerPass("Total Stash balance", "Clicked on 'Put your stash in cash' text in main page");
        }
        else if(ifElementPresent(MainSelectors.txtTotalStashBalance, "'Total Stash balance' text")) {
            waitForElementAndClickIfPresent(MainSelectors.txtTotalStashBalance, 20,"Click 'Total Stash balance' text in main page");
            extent.extentLoggerPass("Total Stash balance", "Clicked on 'Total Stash balance' text in main page");
        }
        else {
            extent.extentLoggerFail("Navigate to Stashes", "Unable to click on Stashes link");
        }
    }
}
