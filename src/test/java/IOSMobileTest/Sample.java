package IOSMobileTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Sample {
    public static void main(String[] args) throws MalformedURLException {
/*

        IOSDriver<IOSElement> driver;

        DesiredCapabilities d = new DesiredCapabilities();

        d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        d.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

// 4 desired
        d.setCapability("xcodeOrgId", "xxxxxxxx"); // Team
        d.setCapability("xcodeSigningId", "iPhone Developer");
        d.setCapability("udid", "xxxxxxxx"); // udid is tied up to real device

        d.setCapability(MobileCapabilityType.APP, "/Users/sanjay/Desktop/UICatalog.app");

// IOSDriver<IOSElement> driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), d);
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), d);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
*/

    }
}
