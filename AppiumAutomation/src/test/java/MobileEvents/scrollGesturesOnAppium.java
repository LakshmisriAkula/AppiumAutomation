package MobileEvents;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;
import projectUtilities.baseUtil;

public class scrollGesturesOnAppium {

	@Test
	public void testScrollGesture() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		WebElement area = driver.findElement(AppiumBy.id("android:id/list"));

		baseUtil.scrollDownToUserCount(driver, area, 2);

		Thread.sleep(2000);

//		driver.executeScript("mobile: scrollGesture",
//				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));

		baseUtil.scrollUp(driver, area);

		Thread.sleep(2000);

	}

}
