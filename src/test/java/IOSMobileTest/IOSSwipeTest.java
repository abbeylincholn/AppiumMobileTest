package IOSMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOSSwipeTest extends IOSBaseTest {

    @Test
    public void IOSSwipeTest() throws InterruptedException
    {
        // Bundle ID
        Map<String, String> params = new HashMap<String, String>();
        params.put("bundleId", "com.apple.mobileslideshow");
        driver.executeScript("mobile:launchApp", params);
        driver.findElement(AppiumBy.iOSNsPredicateString("label == 'Favorites'")).click();
        List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeImage"));
        System.out.println(allPhotos.size());
        Assert.assertEquals(allPhotos.size(), 5);
        //driver.findElement(AppiumBy.accessibilityId("Albums")).click();  // clean


    }
    }
