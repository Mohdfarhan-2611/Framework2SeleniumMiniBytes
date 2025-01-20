package org.example.Base;

import org.example.Constant.FrameworkConstant;
import org.example.Driver.DriverManagerTL;
import org.example.Enum.WaitStrategy;
import org.example.Factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void clickElement(By by, WaitStrategy waitStrategy)
    {
       WebElement element =  ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
                  element.click();
    }

    protected void sendkeys(By by, String key, WaitStrategy waitStrategy)
    {
      WebElement element=  ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
                 element.sendKeys(key);
    }


    protected String getPageTitle()
    {
        return DriverManagerTL.getDriver().getTitle();
    }

}
