package IOSMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOSSwipeTest1 extends IOSBaseTest {

    @Test
    public void IOSSwipeTest() throws InterruptedException
    {
        // Bundle ID
        Map<String, String> params = new HashMap<String, String>();
        params.put("bundleId", "com.apple.mobileslideshow");
        driver.executeScript("mobile:launchApp", params);

        List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeImage"));
        //Assert.assertEquals(allPhotos.size(), 5);
        //driver.findElement(By.id("//XCUIElementTypeButton[@name=\"all_photos_grid\"]")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[1]")).click();
        for (int i = 0; i < allPhotos.size(); i++) {
            System.out.println(driver.findElement(By.xpath("//XCUIElementTypeStaticText")).getAttribute("name"));
            Map<String, Object> params1 = new HashMap();
            params1.put("direction", "left");
            driver.executeScript("mobile: swipe", params1);
            break;
        }
        driver.findElement(AppiumBy.accessibilityId("Back")).click();

    }
    }
