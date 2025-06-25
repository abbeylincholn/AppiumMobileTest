package IOSMobileTest;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class IOSBaseTest {

    public IOSDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppiumServer() throws URISyntaxException, MalformedURLException {
        // Code to configure and start the Appium server
        // This could include setting up desired capabilities, starting the server, etc.
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))  // programmatic way to start Appium server
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();  // start the Appium server

        XCUITestOptions  options = new XCUITestOptions();
        options.setDeviceName("iPhone 16 Pro");
        options.setApp("/Users/alhamdulilahi/Library/Developer/Xcode/DerivedData/UIKitCatalog-hgyzzrgpiopflxejbyvtthdabnmi/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
        options.setPlatformVersion("18.5");
        options.setPlatformName("IOS");
        //Appium-Webdriver Agent -> IOS Apps
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), options);  // create an instance of AndroidDriver with the Appium server URL and options
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // set implicit wait timeout for the driver
    }



    @AfterClass
    public void tearDown(){
        driver.quit();  // close the driver and stop the Appium server
        service.stop();  // stop the Appium server
    }
}
