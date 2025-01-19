package org.example.Driver;

import org.openqa.selenium.WebDriver;

public class DriverManagerTL {

    protected DriverManagerTL(){

    }

    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    // Returns the WebDriver instance from ThreadLocal
    public static WebDriver getDriver()
    {
        return dr.get();
    }

    // Sets the WebDriver instance into ThreadLocal
    public static void setDriver(WebDriver driverref)
    {
        dr.set(driverref);
    }

    // Removes the WebDriver instance from ThreadLocal
    public static void unload()
    {
        dr.remove();
    }
}
