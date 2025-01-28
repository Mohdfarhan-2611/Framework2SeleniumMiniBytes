package org.example.Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.example.Driver.DriverManager;
import org.example.Report.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    protected BaseTest()
    {

    }

    @BeforeSuite
    public void beforSuite()
    {
        ExtentReport.initReports();
    }

    @AfterSuite
    public void afterSuite()
    {
        ExtentReport.flushReports();
    }


    @BeforeMethod
    public static void setup() throws Exception {
        DriverManager.init();
    }


    @AfterMethod
    public static void teardown()
    {
        DriverManager.quit();
    }

}
