package App_MobileBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest {

    @Test
    public void browserTest() throws InterruptedException {

       /* driver.get("http://google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Accept all']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", acceptButton);
        wait.until(ExpectedConditions.elementToBeClickable(acceptButton)).click();

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
        searchBox.sendKeys("bet9ja.com");
        searchBox.sendKeys(Keys.ENTER);*/


        driver.get("https://rahulshettyacademy.com/angularAppdemo/");
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        driver.findElement(By.xpath("(//a[@routerlink='/products'])[1]")).click();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
        String result = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
        Assert.assertEquals(result, "Devops");

    }

}
