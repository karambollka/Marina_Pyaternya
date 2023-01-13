package ua.hillal.tests.refactoring;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Upload extends BaseTest{
    String fileName = "LambdaTest.txt";
    String pathFile = "target/download/";

    @Test
    public void upload () throws IOException {
        changeFile();
        openMainPage().goToUpload().pathToTheFile("target/download/" + fileName).clickUploadButton();

    }
    public void changeFile () throws IOException{
        File file  = new File("target/download/LambdaTest.txt");
        List<String> lines = Files.readAllLines(file.toPath());
        lines  = new ArrayList<>();
        lines.add("test 1");
        lines.add("test 2");
        lines.add("test 3");
        Files.write(file.toPath(),lines);
        file.deleteOnExit();
    }
}
