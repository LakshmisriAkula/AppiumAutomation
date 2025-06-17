package MobileEvents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class dragnDropGestures {

	@Test
	public void testDragnDropGesture() throws InterruptedException {
		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		Thread.sleep(2000);
		// click on drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		Thread.sleep(2000);

		WebElement longClickElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		driver.executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId(), "endX", 633, "endY", 972));

	}
}
