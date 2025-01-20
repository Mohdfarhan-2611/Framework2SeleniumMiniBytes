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
        clickElement(profile_icon, "Present");
        return this;
    }

    public AvibraLoginPage clicklogout()
    {
        clickElement(logout_button, "Clickable");
        return new AvibraLoginPage();
    }
}
