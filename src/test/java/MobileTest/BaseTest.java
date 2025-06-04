package MobileTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppiumServer() throws URISyntaxException, MalformedURLException {
        // Code to configure and start the Appium server
        // This could include setting up desired capabilities, starting the server, etc.
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\abbey\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))  // programmatic way to start Appium server
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();  // start the Appium server

        UiAutomator2Options options = new UiAutomator2Options();  // create an instance of UiAutomator2Options to set capabilities for the Android driver
        options.setDeviceName("Abbeyemulator");
        options.setApp("C:\\Users\\abbey\\OneDrive\\Desktop\\BACKUP\\Software\\AppiumMobileTest\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");

       driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);  // create an instance of AndroidDriver with the Appium server URL and options
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // set implicit wait timeout for the driver
    }

    @AfterClass
    public void tearDown(){
        driver.quit();  // close the driver and stop the Appium server
        service.stop();  // stop the Appium server
    }
}
