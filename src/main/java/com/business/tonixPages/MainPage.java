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

        explicitWaitVisibility(MainSelectors.txtTotalStashBalance,120);
        if(verifyElementPresent(MainSelectors.txtTotalStashBalance, "Total Stash balance text")) {
            waitForElementAndClickIfPresent(MainSelectors.txtTotalStashBalance, 20,"Click Total Stash balance text");
            logger.info("Total Stash balance text");
            extent.extentLoggerPass("Total Stash balance", "Clicked on Total Stash balance");
        }
        else {
            logger.info("Popup is not displayed");
            extent.extentLoggerFail("Allow popup", "Allow popup not displayed");
        }
    }
}
