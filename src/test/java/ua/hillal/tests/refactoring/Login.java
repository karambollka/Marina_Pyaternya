package ua.hillal.tests.refactoring;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillal.tests.pages.SecurePage;

public class Login  extends BaseTest{
    @Test
    public void correctLogin() {
        SecurePage securePage = openMainPage().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        String text = securePage.getPageName();
        Assert.assertTrue(text.contains("You logged into a secure area!\n" + "×"));
    }

    @Test
    public void invalidLogin() {
        SecurePage securePage = openMainPage().goToLoginPage()
                .setUsername("login")
                .setPassword("qwerty!")
                .clickLoginButton();
        String text = securePage.getInvalidLogin();
        Assert.assertTrue(text.contains("Your username is invalid!\n" + "×"));
    }



}
