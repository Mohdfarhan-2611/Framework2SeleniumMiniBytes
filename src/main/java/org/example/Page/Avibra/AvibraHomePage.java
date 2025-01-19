package org.example.Page.Avibra;

import com.google.common.util.concurrent.Uninterruptibles;
import org.example.Base.BasePage;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public final class AvibraHomePage extends BasePage {


    //Locators
    private final By profile_icon = By.xpath("//button[@class=\"btn btn-secondary user-tab\"]");
    private final By logout_button= By.xpath("//div[@class='popover-body']//ul");


    //Action
    public AvibraHomePage clickprofilebutton()
    {
        WebDriverWait wait = new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(profile_icon));
        clickElement(profile_icon);
        return this;
    }

    public AvibraLoginPage clicklogout()
    {
        WebDriverWait wait = new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logout_button));
        clickElement(logout_button);
        return new AvibraLoginPage();
    }
}
