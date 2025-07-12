package AndroidMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class LongPress extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"1. Custom Adapter\")")).click();
        WebElement ele = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")"));
        longPressAction(ele);
        String menuText = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sample menu\")")).getText();
        Assert.assertEquals(menuText, "Sample menu");
        Assert.assertTrue(driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sample menu\")")).isDisplayed());
    }
}




