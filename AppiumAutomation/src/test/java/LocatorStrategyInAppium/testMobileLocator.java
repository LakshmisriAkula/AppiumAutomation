package LocatorStrategyInAppium;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtilities.AppiumDriverInitialization;

public class testMobileLocator {

	@Test
	
	public void testApiumLocators() {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		System.out.println(ele1);
		ele1.click();
		
		driver.navigate().back();
		
		WebElement ele2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
		System.out.println(ele2);
		ele2.click();
		
		driver.navigate().back();

		
		WebElement ele3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
		System.out.println(ele3);
		ele3.click();
		
		driver.navigate().back();

		
		WebElement ele4 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
		System.out.println(ele4.getText());
		ele4.click();
		
		driver.navigate().back();

		
		WebElement ele5 = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
		System.out.println(ele5.getText());
		ele5.click();
	}
}
