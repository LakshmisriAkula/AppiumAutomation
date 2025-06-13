package appiumConnectionSetups;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CreateAppiumConnectionUsingDC {

	@Test
	public void createAppiumCnction() {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "medium_phone");

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		dc.setCapability("appium:app", apkPath);

		URL url;
		try {
			url = new URL("http://192.168.29.199:4723/");
			AppiumDriver appiumDriver = new AppiumDriver(url, dc);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
