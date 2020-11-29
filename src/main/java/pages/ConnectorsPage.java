package pages;

import org.openqa.selenium.By;

public class ConnectorsPage {

    private By cloudDeviceButton = By.id("cloud-devices-button");
    private By office365Admin = By.id("o365_admin");
    private By physicalDevice = By.id("physical-devices");

    public By getCloudDeviceButton() {
        return cloudDeviceButton;
    }

    public By getOffice365Admin() {
        return office365Admin;
    }

    public By getPhysicalDevice() {
        return physicalDevice;
    }
}
