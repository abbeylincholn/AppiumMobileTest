package IOSMobileTest;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class IOSBasics extends IOSBaseTest {

    @Test
    public void IOSBasicsTest() {
        //Xpath, classname, IOS, iosClassChain, IOSPredicateString, accessibility id, id
        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        // driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Text Entry']")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
    }

}
