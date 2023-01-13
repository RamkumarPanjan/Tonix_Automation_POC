package com.business.tonixPages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertNotNull;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.asserts.SoftAssert;

import com.Datasheet.RingPay_TestData_DataProvider;
import com.driverInstance.CommandBase;
import com.extent.ExtentReporter;
import com.propertyfilereader.PropertyFileReader;
import com.utility.LoggingUtils;
import com.utility.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasePage extends Utilities {
	
	public String formattedDate =null;

	public BasePage() throws InterruptedException {
		//new CommandBase(Application);
		init();
	}

	public BasePage(String Application) throws InterruptedException {
		new CommandBase(Application);
		init();
	}


	RingPay_TestData_DataProvider dataProvider = new RingPay_TestData_DataProvider();
	public int timeout;
	SoftAssert softAssertion = new SoftAssert();
	boolean launch = "" != null;
	/** Retry Count */
	public int retryCount;
	ExtentReporter extent = new ExtentReporter();

	/** The Constant logger. */
	public static LoggingUtils logger = new LoggingUtils();

	/** The Android driver. */
	public AndroidDriver<AndroidElement> androidDriver;

	public static boolean relaunchFlag = false;
	public static boolean appliTools = false;

	public static boolean PopUp = false;

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;

	}


	/**
	 * Initiate Property File.
	 *
	 * @param byLocator the by locator
	 */

	public void init() {

		PropertyFileReader handler = new PropertyFileReader("properties/Execution.properties");
		setTimeout(Integer.parseInt(handler.getproperty("TIMEOUT")));
		setRetryCount(Integer.parseInt(handler.getproperty("RETRY_COUNT")));
		logger.info(
				"Loaded the following properties" + " TimeOut :" + getTimeout() + " RetryCount :" + getRetryCount());
	}

	public void TearDown() {
		logger.info("App tear Down");
		getDriver().quit();
	}


	public  String dateComparison() {
		LocalDateTime myDateObj = LocalDateTime.now(ZoneId.of("UTC+08:00"));
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd MMM YYYY hh.mm a");
		formattedDate= myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		ZoneId zone = ZoneId.of("UTC+08:00");
		ZonedDateTime zdt = myDateObj.atZone(zone);
		Instant instant = zdt.toInstant();
		instant.toString();
		return formattedDate;
	}

	public  String dateComparisonWithoutTime() {
		LocalDateTime myDateObj = LocalDateTime.now(ZoneId.of("UTC+08:00"));
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd MMM YYYY");
		formattedDate= myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
		ZoneId zone = ZoneId.of("UTC+08:00");
		ZonedDateTime zdt = myDateObj.atZone(zone);
		Instant instant = zdt.toInstant();
		instant.toString();
		return formattedDate;
	}

	public void moveToPreviousPage(int count) {
		Back(count);
		waitTime(6000);
	}

}
