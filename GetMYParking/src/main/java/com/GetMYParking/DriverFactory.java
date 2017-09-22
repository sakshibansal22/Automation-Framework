package com.GetMYParking;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	private static Logger log = LogManager.getLogger(DriverFactory.class);
	/** The driver. */
	public static AndroidDriver driver = null;

	@BeforeTest
	public static void beforeTest() {
		File fb = new File("src");
		File fs = new File(fb, Constant.Application);

		// Set Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.VERSION, Constant.DEVICE_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM, Constant.DEVICE_VERSION);
		capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constant.DEVICE_NAME);
		capabilities.setCapability("autoAcceptAlerts", true);

		// Create Driver
		try {
			driver = new AndroidDriver(new URL(System.getProperty(Constant.HUB_URL)), capabilities);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
