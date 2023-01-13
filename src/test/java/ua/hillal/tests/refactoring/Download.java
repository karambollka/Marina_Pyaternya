package ua.hillal.tests.refactoring;

import org.testng.annotations.Test;

public class Download extends BaseTest{

    String fileName = "LambdaTest.txt";

    @Test
    public void download () {
        openMainPage().goToDownload().clickDownload(fileName);
    }
}
