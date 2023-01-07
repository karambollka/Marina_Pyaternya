package ua.hillal.tests.refactoring;

import org.testng.annotations.Test;
import ua.hillal.tests.pages.HoversPage;

public class Hovers extends BaseTest{

    @Test
    public void challengingDom (){
        HoversPage hoversPage = openMainPage().goToHovers().userInformation();
    }
}
