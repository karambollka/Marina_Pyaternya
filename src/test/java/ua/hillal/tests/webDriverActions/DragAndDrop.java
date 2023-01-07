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

public class DragAndDrop {

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }


    @Test
    public void dragAndDrop() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions action =  new Actions(driver);
        action.dragAndDrop(drag, drop).perform();
        Assert.assertEquals(drop.getText().contains("Dropped!"), drop.getText().contains("Dropped!"));
        System.out.println(drop.getText());

        driver.quit();

    }
}
