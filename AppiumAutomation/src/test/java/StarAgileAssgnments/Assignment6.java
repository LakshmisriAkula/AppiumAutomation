package StarAgileAssgnments;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Assignment6 {

//	6: Write automation script to open API Demos application and capture the screenshot

	@Test
	public void captureScreenshot() throws InterruptedException {

		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir") + "//src//test//resources//ApiDemos-debug.apk";
		auto.setCapability("appium:app", apkPath);
		URL url;
		try {
			url = new URL("http://192.168.1.15:4723/");
			AndroidDriver driver = new AndroidDriver(url, auto);
			Thread.sleep(1500);

			try {
				File srcFile = driver.getScreenshotAs(OutputType.FILE);
				File destFile = new File("screenshot.png");
				FileHandler.copy(srcFile, destFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error " + e.getMessage());
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
