package actions;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class HomePageActions extends BasePageActions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        openUrl(homePage.getPageUrl());
        waitForVisibilityOf(homePage.getSignIn(), 5);
    }

    public void login(String login, String password) {
        click(homePage.getSignIn());
        waitForVisibilityOf(loginPage.getLogin());
        sendKeys(loginPage.getLogin(),login);
        sendKeys(loginPage.getPassword(),password);
        click(loginPage.getSubmit());
     }
}
