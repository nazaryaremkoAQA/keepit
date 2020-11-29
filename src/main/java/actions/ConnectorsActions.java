package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ConnectorsPage;
import pages.createnewoffice365AdminPage;

public class ConnectorsActions extends BasePageActions {

    ConnectorsPage connectorsPage = new ConnectorsPage();
    createnewoffice365AdminPage createnewoffice365AdminPage = new createnewoffice365AdminPage();

    public ConnectorsActions(WebDriver driver) {
        super(driver);
    }

    public String get365OfficeHeader(){
        waitForVisibilityOf(connectorsPage.getPhysicalDevice());
        scrollToElement(connectorsPage.getCloudDeviceButton());
        click(connectorsPage.getCloudDeviceButton());
        click(connectorsPage.getOffice365Admin());
        return getText(createnewoffice365AdminPage.getHeader());
    }



}
