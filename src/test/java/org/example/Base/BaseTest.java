package org.example.Base;

import org.example.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    protected BaseTest()
    {

    }



    @BeforeMethod
    public static void setup() throws Exception {
        DriverManager.init();
    }



    @AfterMethod
    public static void teardown()
    {
        DriverManager.quit();
    }

}
