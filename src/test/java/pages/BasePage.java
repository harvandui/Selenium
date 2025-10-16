package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private static WebDriver driver;
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    protected void navigateTo(String url) {
        driver.get(url);
    }

    protected void writeIn(String locator, String text) {
        Find(locator).sendKeys(text);
    }

    protected void clickOn(String locator) {
        Find(locator).click();
    }

    protected String getText(String locator) {
        return Find(locator).getText();
    }

    protected void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }




}
