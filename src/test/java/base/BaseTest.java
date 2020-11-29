package base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Utils;

public class BaseTest {

    protected Utils utils= new Utils();
    protected WebDriver driver = BrowserDriverFactory.getDriver(utils.getProperty("browser"));

    @BeforeClass(alwaysRun = true)
    public void init(ITestContext ctx) {
        // Maximize browser
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}
