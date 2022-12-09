package ua.hillal.tests;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest(){
        System.out.println("First test");

        System.out.println("Running test " + System.getProperty("url"));
    }
}
