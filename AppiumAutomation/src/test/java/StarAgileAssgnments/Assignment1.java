package StarAgileAssgnments;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Assignment1 {
//	1: Write automation script for connecting android device and capture the session Id for connection.

	@Test
	public void ConnectAndroidDevice() {

		AndroidDriver driver = BaseDriver.driverSetup();

		System.out.println("Session ID: " + driver.getSessionId());

	}

}
