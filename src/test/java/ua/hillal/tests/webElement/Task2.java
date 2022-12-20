package ua.hillal.tests.webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
           }


    @Test
    public void correctLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.success")).getText(),"You logged into a secure area!\n" + "×");

        driver.quit();
    }

    @Test
    public void invalidLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("login");
        driver.findElement(By.id("password")).sendKeys("qwerty");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.error")).getText(),"Your username is invalid!\n" + "×");

        driver.quit();
    }
}
