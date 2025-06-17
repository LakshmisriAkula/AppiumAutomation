package appium_androidSpecificOperations;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class wifiDataNotifications {

	@Test
	public void testWifiDataNotificationAndroidSpecifications() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.openNotifications();

		driver.findElement(
				AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.android.systemui:id/chevron\"])[1]"))
				.click();

		Thread.sleep(1000);

		// on to off
		driver.toggleWifi();

		// off to on
		driver.toggleWifi();

		// on to off

		driver.toggleData();

		// off to on

		driver.toggleData();

		Thread.sleep(1500);

		driver.findElement(AppiumBy.id("com.android.systemui:id/done_button")).click();

		Thread.sleep(1500);

		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Airplane mode\")")).click();

		Thread.sleep(1500);

		driver.openNotifications();

		Thread.sleep(1500);

	}

}
