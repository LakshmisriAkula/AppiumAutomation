package appium_androidSpecificOperations;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class lock_unlockfunctions {

	@Test
	public void testLockUnlockFunctions() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.lockDevice();

		System.out.println("My device locked");

		Thread.sleep(2000);

		driver.unlockDevice();

		System.out.println("My device unlocked");

		Thread.sleep(2000);

		driver.rotate(ScreenOrientation.LANDSCAPE);

		System.out.println("this will rotate my mobile into landscape view");

		Thread.sleep(2000);

		driver.rotate(ScreenOrientation.PORTRAIT);

		System.out.println("this will rotate my mobile into portrait view");

		Thread.sleep(2000);

	}

}
