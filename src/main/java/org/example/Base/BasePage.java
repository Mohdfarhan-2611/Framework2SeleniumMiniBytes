package org.example.Base;

import org.example.Constant.FrameworkConstant;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void clickElement(By by,  String waitStrategy)
    {
        if(waitStrategy.equalsIgnoreCase("Clickale"))
        {
            explicitywaitforElementToBeClickable(by);
        }
        else if (waitStrategy.equalsIgnoreCase("Present")) {

            explicitywaitforElementToBePresent(by);
        }
        DriverManagerTL.getDriver().findElement(by).click();
    }

    protected void sendkeys(By by, String key, String waitStrategy)
    {
        if(waitStrategy.equalsIgnoreCase("Clickale"))
        {
            explicitywaitforElementToBeClickable(by);
        }
        else if (waitStrategy.equalsIgnoreCase("Present")) {

            explicitywaitforElementToBePresent(by);
        }
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }


    protected String getPageTitle()
    {
        return DriverManagerTL.getDriver().getTitle();
    }

    private void explicitywaitforElementToBeClickable(By by)
    {
        new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(FrameworkConstant.getEXPLICITWAIT()))
                .until(ExpectedConditions.elementToBeClickable(by));
    }


    private void explicitywaitforElementToBePresent(By by)
    {
        new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(FrameworkConstant.getEXPLICITWAIT()))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
