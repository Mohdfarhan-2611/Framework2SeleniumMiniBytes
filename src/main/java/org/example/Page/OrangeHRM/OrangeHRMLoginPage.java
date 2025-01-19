package org.example.Page.OrangeHRM;

import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;

public final class OrangeHRMLoginPage {
    /*
      id
      name
      classname
      linktext
      partiallinktext
      CSS or xPath

     */
    //Locators
     private final By textbox_username = By.xpath("//input[@name='username']");
     private final By textbox_password = By.xpath("//input[@name= 'password' and @type='password']");
     private final By login_button = By.xpath("//button[@type='submit']");



    //Actions
    public OrangeHRMLoginPage enterusername(String username) throws InterruptedException {
        Thread.sleep(4000);
        DriverManagerTL.getDriver().findElement(textbox_username).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterpassword(String password)
    {
        DriverManagerTL.getDriver().findElement(textbox_password).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickLogin()
    {
        DriverManagerTL.getDriver().findElement(login_button).click();
        return new OrangeHRMHomePage();
    }



}
