package ua.hillal.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage  extends BasePage {

    public DownloadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void clickDownload(String fileName) {
        WebElement element = driver.findElement(By.linkText(fileName));
        clickButton(element);
    }
}

