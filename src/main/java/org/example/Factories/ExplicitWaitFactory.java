package org.example.Factories;

import org.example.Constant.FrameworkConstant;
import org.example.Driver.DriverManagerTL;
import org.example.Enum.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitFactory {

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by)
    {
        WebElement element = null;
        if(waitStrategy == WaitStrategy.CLICKABLE)
        {
          element=  new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(FrameworkConstant.getEXPLICITWAIT()))
                    .until(ExpectedConditions.elementToBeClickable(by));
        }
        else if (waitStrategy==WaitStrategy.PRESENT) {

           element= new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(FrameworkConstant.getEXPLICITWAIT()))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
        }
        else if (waitStrategy==WaitStrategy.VISIBLE) {

         element=  new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(FrameworkConstant.getEXPLICITWAIT()))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
        }
        else
        {
            System.out.println("element is not found");
        }

        return element;
    }

}
