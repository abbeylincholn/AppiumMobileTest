package AndroidMobileTest;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class ScrollDemo extends BaseTest{

    @Test
    public void scrollDemoTest() throws MalformedURLException, URISyntaxException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));

        // scroll to the end
        scrollToEndAction();

    }
}




