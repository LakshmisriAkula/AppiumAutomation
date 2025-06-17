package projectUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class baseUtil {

	public static void scrollDownToUserCount(AppiumDriver driver, WebElement area, int count) {

		for (int i = 0; i < count; i++) {

			driver.executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
					((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));

			System.out.println("Iteration: " + i);

		}

	}

	public static void scrollDown(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));

	}

	public static void scrollUp(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "up", "percent", 1.0));

	}

	public static void scrollLeft(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "left", "percent", 1.0));

	}

	public static void scrollRight(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "right", "percent", 1.0));

	}

	// Swipe Gestures

	public static void swipeLeft(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: swipeGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "left", "percent", 0.75));

	}

	public static void swipeRight(AppiumDriver driver, WebElement area) {

		driver.executeScript("mobile: swipeGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "right", "percent", 0.75));

	}

}
