package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class BrowserDriverFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private String browser;

    private BrowserDriverFactory(String browser) {
        this.browser = browser;
    }

    public static WebDriver getDriver(String browser) {
        BrowserDriverFactory driverFactory = new BrowserDriverFactory(browser);
        return driverFactory.createDriver();
    }

    private ChromeOptions getChrome_options(){
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--no-sandbox");
        chrome_options.addArguments("--disable-dev-shm-usage");
        return chrome_options;
    }

    private FirefoxOptions getFirefox_options(){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        firefoxOptions.addArguments("--no-sandbox");
        firefoxOptions.addArguments("--disable-dev-shm-usage");
        return firefoxOptions;
    }

    private WebDriver createDriver() {

        switch (browser) {

            case "geckodriver":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                driver.set(new FirefoxDriver(getFirefox_options()));
                break;

            default:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver.set(new ChromeDriver(getChrome_options()));
                break;
        }
        return driver.get();
    }
}
