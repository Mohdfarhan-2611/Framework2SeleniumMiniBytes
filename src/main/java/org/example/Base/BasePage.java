package org.example.Base;

import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;

public class BasePage {

    protected void clickElement(By by)
    {
        DriverManagerTL.getDriver().findElement(by).click();
    }

    protected void sendkeys(By by, String key)
    {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }
}
