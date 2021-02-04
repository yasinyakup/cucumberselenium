package com.yaytech.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;
    private Actions actions;
    private final String PROJECT_PATH = System.getProperty("user.dir");

    public ExtentReports report;
    public  ExtentSparkReporter sparkReporter;
    public ExtentTest extentTest;

     public static final String BASE_URL = "http://practice.cybertekschool.com/";
     public static final String BASE_URL2 = "http://qa3.vytrack.com/";

    public WebDriver getDriver() {
        return driver;
    }


    public void beforeMethod(){
        this.driver = WebDriverFactory.getDriver();
        driver.manage().window().fullscreen();
        this.actions = new Actions(this.driver);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get(BASE_URL2);
    }


    public void afterMethod(){
            WebDriverFactory.closeDriver();

    }

}
