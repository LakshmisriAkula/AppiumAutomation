package projectUtilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverInitialization {
	
	public static AppiumDriver appiumDriver;
	
	public static AppiumDriver createAppiumDriver() {
		
        UiAutomator2Options auto = new UiAutomator2Options();
		
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);

		URL url;
		try {
			url = new URL("http://192.168.29.199:4723/");
			appiumDriver = new AppiumDriver(url, auto);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return appiumDriver;
	}
		
	}

}
