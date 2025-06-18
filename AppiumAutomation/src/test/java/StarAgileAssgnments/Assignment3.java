package StarAgileAssgnments;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Assignment3 {

//	3: Uninstall the app (any sample app)

	@Test
	public void appUninstallTest() throws InterruptedException {

		AndroidDriver driver = BaseDriver.driverSetup();

		String currentPackage = driver.getCurrentPackage();

		driver.removeApp(currentPackage);

		System.out.println("App State (After Uninstall): " + driver.queryAppState(currentPackage));

	}
}
