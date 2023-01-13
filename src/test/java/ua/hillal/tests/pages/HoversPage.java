package ua.hillal.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HoversPage extends BasePage {

    @FindBy(css = "div.figure")
    private List<WebElement> userAvatars;

    private By userName = By.cssSelector("div.figure h5");

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HoversPage userInformation() {
        Actions action = new Actions(driver);
        // List<WebElement> user = driver.findElements(userAvatars);
        for (WebElement avatar : userAvatars) {
            action.moveToElement(avatar).perform();
            List<WebElement> usersname = driver.findElements(userName);
            for (int l = 0; l < usersname.size(); l++) {
                System.out.println(usersname.get(l).getText());
            }
        }
        return null;
    }

}

