package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class LocatorAssignment {

	@Test

	public void locatorAssignment() {

		// assignment for you guys is : get the text of multiple element and click them
		// one by one with className

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		List<WebElement> menuItems = driver.findElements(AppiumBy.className("android.widget.TextView"));

		for (WebElement item : menuItems) {

			String text = item.getText();

			System.out.println("Menu name using class " + item.getText());

			if (!text.equals("API Demos")) {

				item.click();

				driver.navigate().back();

			}

		}

		// assignment for you guys is : get the text of multiple element and click them
		// one by one with id

		List<WebElement> menuList = driver.findElements(AppiumBy.id("android:id/text1"));

		for (WebElement listItem : menuList) {

			System.out.println("Menu name using id " + listItem.getText());

			listItem.click();

			driver.navigate().back();

		}

	}

}
