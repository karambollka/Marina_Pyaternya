package ua.hillal.tests.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

    @Test(dataProvider = "userData", groups = "login")
    public void dataTest(String user, String pass, String role) {
        System.out.println("running test for " + user);
        if (user.equals("admin")) {
            throw new RuntimeException("ERROR");
        }
    }


@DataProvider (name = "userData")
public Object[][] loginDataProvider() {
        Object[][] result = {
                {"user1", "Pass1", "admin"},
                {"user2", "Pass2", "accountant"},
                {"user3", "Pass2", "shop"}
        };
        return result;
}
}
