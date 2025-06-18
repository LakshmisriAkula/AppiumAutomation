package appium_androidSpecificOperations;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class AutomateAppCommands {

	@Test
	public void testAppCommands() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		String currentPackage = driver.getCurrentPackage();

		System.out.println("current package of my app " + currentPackage);

		System.out.println("current state --> " + driver.queryAppState(currentPackage));

		Thread.sleep(5000);

		driver.terminateApp(currentPackage);

		System.out.println("app state after terminate--> " + driver.queryAppState(currentPackage));

		driver.removeApp(currentPackage);

		Thread.sleep(4000);

		System.out.println("app state after uninstalling--> " + driver.queryAppState(currentPackage));

		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		driver.installApp(apkPath);

		Thread.sleep(4000);

		System.out.println("app state after installing--> " + driver.queryAppState(currentPackage));

		// this activate theapp
		driver.activateApp(currentPackage);

		Thread.sleep(4000);

		System.out.println("app state after activating --> " + ((AndroidDriver) driver).queryAppState(currentPackage));
		Thread.sleep(4000);

		// run at background
		driver.runAppInBackground(Duration.ofSeconds(10));
		System.out.println("app state in background --> " + ((AndroidDriver) driver).queryAppState(currentPackage));

	}

}
