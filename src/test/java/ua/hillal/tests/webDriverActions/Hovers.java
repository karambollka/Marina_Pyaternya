package ua.hillal.tests.webDriverActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Hovers {

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void hoverMenu() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        Actions action = new Actions(driver);
        List<WebElement> users = driver.findElements(By.cssSelector("div.figure"));
        for (int i =0; i<users.size(); i++ ){
            action.moveToElement(users.get(i)).perform();
            List<WebElement> usersname = driver.findElements(By.cssSelector("div.figure h5"));
            for (int l =0; l<usersname.size(); l++){
                System.out.println(usersname.get(l).getText());
            }
        }

        driver.quit();
    }
}
