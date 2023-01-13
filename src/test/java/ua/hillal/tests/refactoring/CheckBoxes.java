package ua.hillal.tests.refactoring;

import org.testng.annotations.Test;
import ua.hillal.tests.pages.CheckBoxesPage;

public class CheckBoxes extends BaseTest{

    @Test
    public void checkBoxes() {
        CheckBoxesPage checkBoxesPage = openMainPage().goToCheckboxes().boxSelected();
    }
}
