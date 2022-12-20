package ua.hillal.tests.webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {

    @Test
    public void clickButton(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Challenging DOM")).click();

        driver.findElement(By.xpath("//*[@ class = 'button']")).click();
        driver.findElement(By.xpath("//*[@ class = 'button alert']")).click();
        driver.findElement(By.xpath("//*[@ class = 'button success']")).click();

        List<WebElement> links = driver.findElements(By.xpath("//tr/td[4]"));
        links.forEach(w->System.out.println(w.getText()));

    }
}
