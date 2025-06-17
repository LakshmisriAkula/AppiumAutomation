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

		UiAutomator2Options auto = new UiAutomator2Options();

		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			AndroidDriver driver = new AndroidDriver(url, auto);
			System.out.println("Session ID: " + driver.getSessionId());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
