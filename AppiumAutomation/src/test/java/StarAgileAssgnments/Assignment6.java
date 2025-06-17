package StarAgileAssgnments;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment6 {

//	6: Write automation script to open API Demos application and capture the screenshot

	@Test
	public void captureScreenshot() throws InterruptedException {

		AndroidDriver driver = BaseDriver.driverSetup();

		Thread.sleep(1500);
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File("screenshot.png");
			FileHandler.copy(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error " + e.getMessage());
		}

	}

}
