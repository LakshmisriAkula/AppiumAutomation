package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseDriver {

	public static AndroidDriver driver;

	public static AndroidDriver driverSetup() {

		UiAutomator2Options auto = new UiAutomator2Options();

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);

		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			driver = new AndroidDriver(url, auto);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;

	}

}
