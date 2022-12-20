package ua.hillal.tests.webElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3 {

    @Test
    public void checkBoxes() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Checkboxes")).click();

        if (driver.findElement(By.xpath("//input[1]")).isSelected()) {
            System.out.println("checkbox state number" + 1 + " enabled");
        } else {
            System.out.println("checkbox state number" + 1 + " disabled");
            driver.findElement(By.xpath("//input[" + 1 + "]")).click();
        }

        if (driver.findElement(By.xpath("//input[2]")).isSelected()) {
            System.out.println("checkbox state number" + 2 + " enabled");
        } else {
            System.out.println("checkbox state number" + 2 + " disabled");
            driver.findElement(By.xpath("//input[" + 2 + "]")).click();
        }

        /* for (int i = 1; i <= 2; i++) {
            if (driver.findElement(By.xpath("//input[" + i + "]")).isSelected()) {
                System.out.println("checkbox state number" + i + " enabled");
            } else
                {
                    System.out.println("checkbox state number" + i + " disabled");
                    //driver.findElement(By.xpath("//input[" + i + "]")).click();
                }
           }*/

        driver.quit();
    }
}


