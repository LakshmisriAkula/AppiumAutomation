package appium_androidSpecificOperations;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import projectUtilities.AppiumDriverInitialization;

public class testIdemoAppMobileDevicePerformance {

	@Test
	public void testAppPerformanceData() {

		AndroidDriver driver = AppiumDriverInitialization.createAppiumDriver();

		List<String> allPackages = driver.getSupportedPerformanceDataTypes();

		System.out.println(allPackages);

//		[cpuinfo, memoryinfo, batteryinfo, networkinfo]

		String currentpackage = driver.getCurrentPackage();
		System.out.println("currentpackage " + currentpackage);

		List<List<Object>> cpuinfo = driver.getPerformanceData(currentpackage, "cpuinfo", 10);

		System.out.println(cpuinfo);

		List<List<Object>> memoryinfo = driver.getPerformanceData(currentpackage, "memoryinfo", 10);
		System.out.println(memoryinfo);

		List<List<Object>> batteryinfo = driver.getPerformanceData(currentpackage, "batteryinfo", 10);
		System.out.println(batteryinfo);

		List<List<Object>> networkinfo = driver.getPerformanceData(currentpackage, "networkinfo", 10);
		System.out.println(networkinfo);

	}

}
