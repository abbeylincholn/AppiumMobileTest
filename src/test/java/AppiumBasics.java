import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics {

    @Test
    public void AppiumTest() throws MalformedURLException, URISyntaxException {
        //AndrioidDriveer, IOSDriver, WindowsDriver
        //Appium code -> Appium server -> Mobile device

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Abbeyemulator");
        options.setApp("C:\\Users\\abbey\\OneDrive\\Desktop\\BACKUP\\Software\\AppiumMobileTest\\Appium\\src\\test\\java\\resources\\app-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.quit();
    }
}
