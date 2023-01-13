package ua.hillal.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage extends BasePage{
    @FindBy(xpath = "//*[@ class = 'button']")
    private WebElement blueButton;

    @FindBy(xpath = "//*[@ class = 'button alert']")
    private WebElement redButton;

    @FindBy(xpath = "//*[@ class = 'button success']")
    private WebElement greenButton;

    //@FindBy(xpath = "//tr/td[4]")
    //private WebElement elements;
    private By elements = By.xpath("//tr/td[4]");

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingDomPage clickBlueButton(){
        blueButton.click();
        return this;
    }
    public ChallengingDomPage clickRedButton(){
        redButton.click();
        return this;
    }
    public ChallengingDomPage clickGreenButton(){
        greenButton.click();
        return this;
    }

    public ChallengingDomPage columElement(){
        List<WebElement> links = driver.findElements(elements);
        links.forEach(w->System.out.println(w.getText()));

        return null;
    }
}
