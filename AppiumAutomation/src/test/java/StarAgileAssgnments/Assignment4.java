package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment4 {

//	4: Install the app using command
	public static AndroidDriver driver;

	@Test
	public void testInstallingAPP() throws MalformedURLException, InterruptedException {

		AndroidDriver driver = BaseDriver.driverSetup();

		String currentPackage = driver.getCurrentPackage();

		driver.removeApp(currentPackage);

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";

		driver.installApp(apkPath);

		Thread.sleep(4000);

		System.out.println("app state after installing --> " + ((AndroidDriver) driver).queryAppState(currentPackage));

		driver.activateApp(currentPackage);

	}

}
