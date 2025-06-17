package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment2 {
//	2: Write automation script for launching mobile application
//	a. Test the application current state
//	b. Send application in background and the again capture the state.

	@Test
	public void appStateTest() {

		AndroidDriver driver = BaseDriver.driverSetup();

		System.out.println("App State (Launched): " + driver.queryAppState(BaseDriver.APP_PACKAGE));

		driver.runAppInBackground(Duration.ofSeconds(10));

		System.out.println("App State (After Resume): " + driver.queryAppState(BaseDriver.APP_PACKAGE));

	}
}
