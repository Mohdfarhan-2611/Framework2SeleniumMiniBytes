package org.example.Report;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private ExtentReport(){};
    private static ExtentReports extent;
    public static ExtentTest test;

    public static void initReports()
    {   if(Objects.isNull(extent))
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
        extent.attachReporter(spark);

        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("TMB Report");
        spark.config().setReportName("Login Report");

    }
    public static void flushReports() {
        if(Objects.nonNull(extent)) {
            extent.flush();
        }
        try {
            Desktop.getDesktop().browse(new File("index.html").toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void createTest(String testcasename)
    {
        test = extent.createTest(testcasename);

    }


}
