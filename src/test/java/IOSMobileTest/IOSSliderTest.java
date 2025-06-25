package IOSMobileTest;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class IOSSliderTest extends IOSBaseTest {

    @Test
    public void IOSSliderTest() throws InterruptedException
    {
        WebElement slider = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`label == 'AppElem'`]"));

        slider.sendKeys("0%"); // set initial value
        System.out.println(slider.getAttribute("value"));

        Thread.sleep(3000); // wait 3 seconds

        slider.sendKeys("1%");
        System.out.println(slider.getAttribute("value"));
    }
    }
