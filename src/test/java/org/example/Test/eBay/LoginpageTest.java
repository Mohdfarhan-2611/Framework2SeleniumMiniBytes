package org.example.Test.eBay;

import org.example.Base.BaseTest;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

//import static org.example.Base.BaseTest.driver;


public final class LoginpageTest extends BaseTest {

    private LoginpageTest()
    {

    }

    @Test
    public static void test01()
    {
        DriverManagerTL.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }

    @Test
    public static void test02()
    {
        DriverManagerTL.getDriver().findElement(By.name("q")).sendKeys("Testing academy", Keys.ENTER);
    }



}
