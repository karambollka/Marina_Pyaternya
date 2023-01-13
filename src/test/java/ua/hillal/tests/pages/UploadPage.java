package ua.hillal.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class UploadPage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement fileSelection;

    @FindBy(id = "drag-drop-upload")
    private WebElement loadingBox;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    public UploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        }

    public void clickButtonSelection (){
        clickButton(fileSelection);
    }
    public UploadPage pathToTheFile (String pathFile){
        fileSelection.sendKeys((new File("target/download/").getAbsolutePath()));
        return this;
    }
    public void clickloadingBox (){
        clickButton(loadingBox);
    }
    public void clickUploadButton (){
        clickButton(uploadButton);
    }
}
