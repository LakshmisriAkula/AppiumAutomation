package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class alertAssignment {

//	2. write an automation script for Alert (up to your choice.)
	Alert alt;

	@Test
	public void testAlerts() throws InterruptedException {
		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.findElement(AppiumBy.accessibilityId("App")).click();

		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();

		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("android:id/button1"))).click();

		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiSelector().text(\"Every Monday\")"))
				.click();

		driver.findElement(AppiumBy.id("android:id/button1")).click();

//		alt = driver.switchTo().alert();
//
//		alt.dismiss();
//
//		Thread.sleep(1500);
//
//		driver.switchTo().defaultContent();
//
//		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
//
//		alt.accept();

		Thread.sleep(1500);

	}
}
