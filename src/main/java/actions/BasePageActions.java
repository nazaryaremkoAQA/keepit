package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasePageActions {

    protected WebDriver driver;

    public BasePageActions(WebDriver driver) {
        this.driver = driver;
   }

    protected void openUrl(String url) {
        driver.get(url);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        waitForVisibilityOf(locator, 5);
        find(locator).click();
    }

    protected void scrollToElement(By cloudDeviceButton) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(cloudDeviceButton));
    }

    protected void sendKeys(By locator, String text) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        waitForVisibilityOf(locator, 5);
        return find(locator).getText();
    }

    protected void waitFor(ExpectedCondition<WebElement> condition, Integer timeOut) {
        timeOut = timeOut != null ? timeOut : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(condition);
    }

    public String getCurrentPage() {
        return driver.getCurrentUrl();
    }

    protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
        int attemps = 0;
        while (attemps < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                break;
            }catch (StaleElementReferenceException e){

            }
            attemps++;
        }
    }
}
