package pages;

import org.openqa.selenium.By;

public class LoginPage {

    private By login = By.id("login-form-login");
    private By password = By.id("login-form-password");
    private By submit = By.id("login-form-login-button");

    public By getLogin() {
        return login;
    }

    public By getPassword() {
        return password;
    }

    public By getSubmit() {
        return submit;
    }
}
