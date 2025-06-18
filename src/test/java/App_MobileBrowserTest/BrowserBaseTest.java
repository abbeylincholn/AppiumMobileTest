package App_MobileBrowserTest;

import MobileTest.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;


public class BrowserBaseTest extends BaseTest {

    @BeforeClass
    public void configAppiumMobileBrowser() throws URISyntaxException, MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\abbey\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))  // programmatic way to start Appium server
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Abbeyemulator");
        options.setChromedriverExecutable("C:\\Users\\abbey\\browserDrivers\\chromedriver.exe");
        options.setCapability("browserName", "Chrome");
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }


}
