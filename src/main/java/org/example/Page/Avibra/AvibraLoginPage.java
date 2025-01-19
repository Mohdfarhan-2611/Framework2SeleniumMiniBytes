package org.example.Page.Avibra;

import com.google.common.util.concurrent.Uninterruptibles;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public final class AvibraLoginPage {

    //locators
    private final By textbox_username = By.xpath("//input[@name='email']");
    private final By textbox_password = By.xpath("//input[@name='password' and @type='password']");
    private final By login_button = By.xpath("//button[@type='submit']");


    //Actions
    public AvibraLoginPage enterusername(String user){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        DriverManagerTL.getDriver().findElement(textbox_username).sendKeys(user);
        return this;
    }

    public AvibraLoginPage enterpassword(String pass){
        DriverManagerTL.getDriver().findElement(textbox_password).sendKeys(pass);
        return this;
    }

    public AvibraHomePage clicklogin() {
        DriverManagerTL.getDriver().findElement(login_button).click();
        return new AvibraHomePage();

    }

    public String getTitle()
    {
       String title = DriverManagerTL.getDriver().getTitle();
       return title;
    }



}
