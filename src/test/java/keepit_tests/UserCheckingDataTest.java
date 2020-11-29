package keepit_tests;

import dataproviders.UserDP;
import io.restassured.response.ResponseBody;
import models.UserModel;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static io.restassured.RestAssured.given;

public class UserCheckingDataTest {

    private String url = "https://ws-test.keepit.com/users/zhc4v6-5ev7di-9hhhlm";
    private String login = "automation@keepitqa.com";
    private String correctPassword = "E#*b2wGIbFHz";

    @Test(dataProvider = "user", dataProviderClass = UserDP.class)
    public void successLogin(UserModel userModel) throws JAXBException {
        ResponseBody body = given().auth().
                basic(login, correctPassword).get(url).body();

        StringReader sr = new StringReader(body.asString());
        JAXBContext jaxbContext = JAXBContext.newInstance(UserModel.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        UserModel response = (UserModel) unmarshaller.unmarshal(sr);

        Assert.assertEquals(userModel,response);

    }
}