package ua.hillal.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage extends BasePage{
    @FindBy(css = "a.radius")
    private WebElement logoutButton;

    @FindBy(css = ".flash.success")
    private WebElement pageName;

    @FindBy(css = ".flash.error")
    private WebElement invalidLogin;

    public SecurePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public LoginPage logout(){
        clickButton(logoutButton);
        return new LoginPage(driver);
    }
    public String getPageName(){
        return pageName.getText();
    }

    public String getInvalidLogin(){
        return invalidLogin.getText();
    }
}
