package MobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class MiscellaneousAppium extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        // set the Wifi settings name
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();

        DeviceRotation landScape = new DeviceRotation(0, 0, 90);
        driver.rotate(landScape);
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        //copy to clipboard - paste it clipboard
        driver.setClipboardText("Abbey Wifi");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.findElement(AppiumBy.id("android:id/button1")).click();
    }
}




