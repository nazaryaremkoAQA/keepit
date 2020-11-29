package keepit_tests;

import data.StatusConstant;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginTest {

    private String url = "https://ws-test.keepit.com/users";
    private String login = "automation@keepitqa.com";
    private String incorrectPassword = "incorrect";
    private String correctPassword = "E#*b2wGIbFHz";

    @Test()
    public void loginWithNoCreds() {
        given().
                when().
                get(url).
                then().
                assertThat().
                statusCode(StatusConstant.UNAUTHORIZED);
    }

    @Test()
    public void loginWithIncorrectPassword() {
        given().auth().
                basic(login, incorrectPassword).
                when().
                get(url).
                then().
                assertThat().
                statusCode(StatusConstant.UNAUTHORIZED);
    }

    @Test()
    public void successLogin() {
        given().auth().
                basic(login, correctPassword).
                when().
                get(url).
                then().
                assertThat().
                statusCode(StatusConstant.SUCCESS_CODE);
    }
}
