package com.business.tonixPages;

import com.android.selectors.LoginSelectors;
import org.testng.Assert;

public class LoginPage extends BasePage {

//    public LoginPage(String Application) throws InterruptedException {
//        super(Application);
//    }

    public LoginPage() throws InterruptedException {
        super();
    }

    /**
     * Business method for Tonix Application Launch
     *
     */

    public void performLogin() throws Exception {
        extent.HeaderChildNode("Tonix Login");

        explicitWaitVisibility(LoginSelectors.txtPageTitle,10);
        if(verifyElementPresent(LoginSelectors.edtPassword, "Password edit field")) {
            String camPermHeaderTxt = getText(LoginSelectors.edtPassword);
            Assert.assertEquals(camPermHeaderTxt, "Password");
            click(LoginSelectors.edtPassword, "Password field");
            type(LoginSelectors.edtPassword  , prop.getproperty("password"), "Enter secret code");
            //waitForElementAndClickIfPresent()
            waitForElementAndClickIfPresent(LoginSelectors.btnLogin, 20,"Log in button");
            logger.info("Logging into Tonix");
            extent.extentLoggerPass("Tonix Login", "Logging into tonix");
        }
        else {
            logger.info("Popup is not displayed");
            extent.extentLoggerFail("Allow popup", "Allow popup not displayed");
        }
    }
}
