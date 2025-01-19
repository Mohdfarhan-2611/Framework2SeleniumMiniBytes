package org.example.Driver;

import org.example.utils.PropertiesReader;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    protected DriverManager()
    {

    }


    public static void init() throws Exception {
        if(DriverManagerTL.getDriver()==null)
        {
            DriverManagerTL.setDriver(new ChromeDriver());
            DriverManagerTL.getDriver().get(PropertiesReader.get("avibra_url"));
        }
    }


    public static void quit()
    {
        if(DriverManagerTL.getDriver()!=null)
        {
            DriverManagerTL.getDriver().quit();
            DriverManagerTL.unload();
        }
    }



}
