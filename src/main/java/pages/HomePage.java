package pages;

import org.openqa.selenium.By;

public class HomePage {

    private String pageUrl = "https://ws-test.keepit.com/keepit.html";

    private By signIn = By.id("signin-page");

    public String getPageUrl() {
        return pageUrl;
    }

    public By getSignIn() {
        return signIn;
    }
}
