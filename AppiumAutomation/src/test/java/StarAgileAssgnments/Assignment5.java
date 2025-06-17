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

		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);
		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			AndroidDriver driver = new AndroidDriver(url, auto);
			Thread.sleep(1500);
			driver.findElement(AppiumBy.accessibilityId("Views")).click();

			Thread.sleep(2000);
			// click on drag and drop
			driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

			Thread.sleep(2000);

			WebElement longClickElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

			driver.executeScript("mobile: dragGesture",
					ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId(), "endX", 633, "endY", 972));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}



