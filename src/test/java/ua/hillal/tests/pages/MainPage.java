package ua.hillal.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends  BasePage {

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthLink;

    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDom;

    @FindBy(linkText = "Hovers")
    private WebElement hovers;

    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxes;

    @FindBy(linkText = "File Download")
    private WebElement fileDownload;

    @FindBy(linkText = "File Upload")
    private WebElement fileUpload;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public LoginPage goToLoginPage(){
        clickButton(formAuthLink);
        return new LoginPage(driver);
    }
    public ChallengingDomPage goToChallengingDom(){
        clickButton(challengingDom);
        return new ChallengingDomPage(driver);
    }
    public HoversPage goToHovers(){
        clickButton(hovers);
        return new HoversPage(driver);
    }

    public CheckBoxesPage goToCheckboxes(){
        clickButton(checkboxes);
        return new CheckBoxesPage(driver);
    }

    public DownloadPage goToDownload(){
        clickButton(fileDownload);
        return new DownloadPage(driver);
    }
    public UploadPage goToUpload(){
        clickButton(fileUpload);
        return new UploadPage(driver);
    }
}


