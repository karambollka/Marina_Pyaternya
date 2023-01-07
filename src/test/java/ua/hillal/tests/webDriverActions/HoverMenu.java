package ua.hillal.tests.webDriverActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HoverMenu {

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void hoverMenu() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        WebElement dropDowm = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDowm);

        WebElement secondaryMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu ')]"));
        actions.moveToElement(secondaryMenu);

        WebElement secondaryAction = driver.findElement(By.xpath("//a[contains (text(), 'Secondary Action')]"));
        actions.moveToElement(secondaryAction).click().perform();

        Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Secondary Page']")).getText(),"Secondary Page");

        driver.quit();

    }
}
