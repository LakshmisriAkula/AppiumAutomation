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

		String currentPackage = driver.getCurrentPackage();

		System.out.println("App State (Launched): " + driver.queryAppState(currentPackage));

		driver.runAppInBackground(Duration.ofSeconds(-1));

		System.out.println("App State in BackGround: " + driver.queryAppState(currentPackage));

		driver.activateApp(currentPackage);

		System.out.println("App State (After activate): " + driver.queryAppState(currentPackage));

	}
}
