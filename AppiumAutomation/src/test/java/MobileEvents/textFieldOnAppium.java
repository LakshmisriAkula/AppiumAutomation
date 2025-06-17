package MobileEvents;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import projectUtilities.AppiumDriverInitialization;
import projectUtilities.baseUtil;

public class textFieldOnAppium {

	@Test
	public void testSendKeysOnAppium() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));

		baseUtil.scrollDownToUserCount(driver, area, 2);

		Thread.sleep(1000);

		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();

//		driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Hello");

		driver.pressKey(new KeyEvent(AndroidKey.H));

		driver.pressKey(new KeyEvent(AndroidKey.E));

		driver.pressKey(new KeyEvent(AndroidKey.L));

		driver.pressKey(new KeyEvent(AndroidKey.L));

		driver.pressKey(new KeyEvent(AndroidKey.O));

		Thread.sleep(2000);

	}

}
