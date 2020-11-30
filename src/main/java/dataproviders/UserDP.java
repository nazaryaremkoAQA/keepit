package dataproviders;

import models.UserModel;
import org.testng.annotations.DataProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;

public class UserDP {

    @DataProvider(name = "user")
    public Object[][] dpMethod() {
        long milli = LocalDateTime.of(2019, 2, 28, 13, 7, 49)
                .toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli();
        UserModel userModel = new UserModel();
        userModel.setEnabled(true);
        userModel.setCreated(new Date(milli));
        userModel.setProduct("7dwqnq-5cvrcm-1z3ehj");
        userModel.setParent("80ltks-yhfls5-24zyf2");
        userModel.setSubscribed(true);
        return new Object[][]{{userModel}};
    }
}
