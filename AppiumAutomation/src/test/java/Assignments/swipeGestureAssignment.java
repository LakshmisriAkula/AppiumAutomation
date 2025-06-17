package Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;
import projectUtilities.baseUtil;

public class swipeGestureAssignment {

//	1. write an automation script for swipe gesture

	@Test
	public void testSwipeGesture() throws InterruptedException {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();

		WebElement area = driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));

		baseUtil.swipeLeft(driver, area);

		Thread.sleep(1500);

		baseUtil.swipeRight(driver, area);

		Thread.sleep(1500);

	}

}
