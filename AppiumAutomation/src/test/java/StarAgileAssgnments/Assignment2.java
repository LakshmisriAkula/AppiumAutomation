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

		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);
		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			AndroidDriver driver = new AndroidDriver(url, auto);
			System.out.println("App State (Launched): " + driver.queryAppState(apkPath));

			driver.runAppInBackground(Duration.ofSeconds(10));

			System.out.println("App State (After Resume): " + driver.queryAppState(apkPath));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
