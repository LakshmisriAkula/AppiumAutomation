package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment3 {

//	3: Uninstall the app (any sample app)

	@Test
	public void appUninstallTest() throws InterruptedException {

		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);
		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			AndroidDriver driver = new AndroidDriver(url, auto);
			Thread.sleep(1500);
			driver.removeApp(apkPath);
			System.out.println("App Uninstalled");

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
