package IOSMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class IOSLongPress extends IOSBaseTest {

    @Test
    public void IOSLongPressTest() {

            driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
            WebElement ele = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Increment'`][3]"));
            Map<String, Object> params = new HashMap<>();
            params.put("element", ((RemoteWebElement) ele).getId());
            params.put("duration", 5);

            driver.executeScript("mobile:touchAndHold", params);
        }

    }
