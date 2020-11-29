package pages;

import org.openqa.selenium.By;

public class createnewoffice365AdminPage {

    private By header = By.xpath("//*[@id='device-form']//div[@class='form-header']");

    public By getHeader() {
        return header;
    }
}
