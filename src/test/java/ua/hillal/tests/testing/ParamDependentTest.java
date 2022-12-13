package ua.hillal.tests.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamDependentTest {
    @Test
    @Parameters({"param"})
    public void paramTest(String param) {
        System.out.println("Running test with value " + param);

    }

    @Test(dependsOnGroups = "login")
    public void dependentTest () {
        String [] users = {"shop", "admin"};
        String [] passw = {"pass1", "pass2"};

        for (String user: users)
            for (String pass: passw){
                System.out.println("running " + user +" "+ pass);
                if (user.equals("shop")& pass.equals("pass2")) {
                    throw new RuntimeException("ERROR: not shop password");
                } else if (user.equals("admin")& pass.equals("pass1")){
                    throw new RuntimeException("ERROR: not admin password");
                }
            }
        }
    }

