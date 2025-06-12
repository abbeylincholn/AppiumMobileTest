package MobileTest;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class OpenAppPackageActivities extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException, URISyntaxException {

        // adb devices
        // For Mac/Linux: adb shell dumpsys window | grep -E 'mCurrentFocus'
        // For Windows: adb shell dumpsys window | find "mCurrentFocus"
        // App Package & App Activity

        Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
        //driver.startActivity(activity);
        ((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap
                .of("intent", "io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));

        driver.findElement(AppiumBy.id("android:id/checkbox")).click();

        DeviceRotation landScape = new DeviceRotation(0, 0, 90);
        driver.rotate(landScape);
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        //copy to clipboard - paste it clipboard
        driver.setClipboardText("Abbey Wifi");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(driver.getClipboardText());
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElement(AppiumBy.id("android:id/button1")).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));


    }
}




