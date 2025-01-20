package org.example.Page.Avibra;

import com.google.common.util.concurrent.Uninterruptibles;
import org.example.Base.BasePage;
import org.example.Driver.DriverManagerTL;
import org.example.Enum.WaitStrategy;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public final class AvibraLoginPage extends BasePage {

    //locators
    private final By textbox_username = By.xpath("//input[@name='email']");
    private final By textbox_password = By.xpath("//input[@name='password' and @type='password']");
    private final By login_button = By.xpath("//button[@type='submit']");


    //Actions
    public AvibraLoginPage enterusername(String user){
        sendkeys(textbox_username, user, WaitStrategy.PRESENT);
        return this;
    }

    public AvibraLoginPage enterpassword(String pass){
        sendkeys(textbox_password, pass, WaitStrategy.PRESENT);
        return this;
    }

    public AvibraHomePage clicklogin() {
        clickElement(login_button, WaitStrategy.CLICKABLE);
        return new AvibraHomePage();

    }

    public String getTitle()
    {
       return getPageTitle();
    }



}
