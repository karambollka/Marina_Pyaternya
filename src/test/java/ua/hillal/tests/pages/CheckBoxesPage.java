package ua.hillal.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage extends BasePage {

     @FindBy(xpath = "//input[1]")
      private WebElement firstBox;

     @FindBy(xpath = "//input[2]")
     private WebElement secondBox;

    // private By firstBox = By.xpath("//input[1]");

    // private By secondBox = By.xpath("//input[2]");

     public CheckBoxesPage(WebDriver driver) {
         super(driver);
         PageFactory.initElements(driver, this);
     }

     public CheckBoxesPage boxSelected() {
         if (firstBox.isSelected()) {
             System.out.println("checkbox state number" + 1 + " enabled");
         } else {
             System.out.println("checkbox state number" + 1 + " disabled");
             firstBox.click();
         }
         if (secondBox.isSelected()) {
             System.out.println("checkbox state number" + 2 + " enabled");
         } else {
             System.out.println("checkbox state number" + 2 + " disabled");
             secondBox.click();
         }
         return null;
     }
   /* public CheckBoxesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkboxes")
    private List<WebElement> checkboxes;

    public CheckBoxesPage boxSelected() {
        for (WebElement checkboxe : checkboxes) {
            if (checkboxe.isSelected()) {
                System.out.println("checkbox state number" + 1 + " enabled");
            } else {
                System.out.println("checkbox state number" + 2 + " disabled");
                checkboxe.click();
            }
        }
        return null;
    }*/
}



