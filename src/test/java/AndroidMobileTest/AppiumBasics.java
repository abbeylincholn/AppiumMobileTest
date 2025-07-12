package AndroidMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class AppiumBasics extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException {
        //AndrioidDriveer, IOSDriver, WindowsDriver
        //Appium code -> Appium server -> Mobile device
        // Perform actions on the app, actual test automation code would go here
        //locatiors: Xpath, id, accessibilityId, classname, androidUIAutomator


        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        // set the Wifi settings name
        driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Abbey Wifi");
        driver.findElement(AppiumBy.id("android:id/button1")).click();
    }
}




