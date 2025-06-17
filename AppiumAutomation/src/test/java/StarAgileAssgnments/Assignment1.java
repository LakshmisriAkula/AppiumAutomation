package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment1 {
//	1: Write automation script for connecting android device and capture the session Id for connection.

	@Test
	public void ConnectAndroidDevice() {

		AndroidDriver driver = BaseDriver.driverSetup();

		System.out.println("Session ID: " + driver.getSessionId());

	}

}
