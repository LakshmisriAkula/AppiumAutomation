package StarAgileAssgnments;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment5 {

//	5: Write automation script to open API Demos application on Mobile device 
//	Go to view and perform drag and drop functionality.

	@Test
	public void dragAndDropTest() throws InterruptedException {

		AndroidDriver driver = BaseDriver.driverSetup();

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
