package org.example.Driver;

import org.example.Enum.ConfigProperties;
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
            DriverManagerTL.getDriver().get(PropertiesReader.get(ConfigProperties.AVIBRA_URL));
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
