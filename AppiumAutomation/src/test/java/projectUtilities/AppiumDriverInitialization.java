package projectUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverInitialization {

//	public static AppiumDriver appiumDriver;

	public static AndroidDriver driver;

	public static AndroidDriver createAppiumDriver() {

		UiAutomator2Options auto = new UiAutomator2Options();

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);

		URL url;
		try {
			url = new URL("http://192.168.1.4:4723/"); // laptop home

			url = new URL("http://192.168.1.15:4723/"); // laptop ofc

//			appiumDriver = new AppiumDriver(url, auto);

			driver = new AndroidDriver(url, auto);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;
	}

}
