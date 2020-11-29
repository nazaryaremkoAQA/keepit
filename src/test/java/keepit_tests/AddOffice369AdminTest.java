package keepit_tests;

import actions.ConnectorsActions;
import actions.HomePageActions;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddOffice369AdminTest extends BaseTest {

    String login = "automation@keepitqa.com";
    String password = "E#*b2wGIbFHz";
    String header = "Create new Office 365 connector";

    @Test()
    public void office365Test() {
        HomePageActions homePageActions = new HomePageActions(driver);
        ConnectorsActions connectorsActions = new ConnectorsActions(driver);
        homePageActions.openPage();
        homePageActions.login(login, password);
        String officeHeader = connectorsActions.get365OfficeHeader();

        Assert.assertEquals(officeHeader, header);
    }
}
