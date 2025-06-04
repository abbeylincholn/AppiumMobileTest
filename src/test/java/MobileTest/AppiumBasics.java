package MobileTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class AppiumBasics {

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException {
        //AndrioidDriveer, IOSDriver, WindowsDriver
        //Appium code -> Appium server -> Mobile device

        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\abbey\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))  // programmatic way to start Appium server
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();  // start the Appium server

        UiAutomator2Options options = new UiAutomator2Options();  // create an instance of UiAutomator2Options to set capabilities for the Android driver
        options.setDeviceName("Abbeyemulator");
        options.setApp("C:\\Users\\abbey\\OneDrive\\Desktop\\BACKUP\\Software\\AppiumMobileTest\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);  // create an instance of AndroidDriver with the Appium server URL and options

        // Perform actions on the app, actual test automation code would go here
        //locatiors: Xpath, id, accessibilityId, classname, androidUIAutomator
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        // set the Wifi settings name

        driver.quit();  // close the driver and stop the Appium server
        service.stop();  // stop the Appium server
    }
}




