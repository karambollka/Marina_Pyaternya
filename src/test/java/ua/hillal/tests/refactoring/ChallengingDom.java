package ua.hillal.tests.refactoring;

import org.testng.annotations.Test;
import ua.hillal.tests.pages.ChallengingDomPage;

public class ChallengingDom extends BaseTest{
    @Test
    public void challengingDom (){
        ChallengingDomPage challengingDomPage = openMainPage().goToChallengingDom()
                .clickBlueButton()
                .clickRedButton()
                .clickGreenButton()
                .columElement();
    }

}
