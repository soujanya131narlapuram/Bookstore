package com.qapitol.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.logging.Logger;

public class Base
{

    public static WebDriver driver=null;
    Logger log;

    public ExtentReports reports;
    public ExtentTest test;
    public void setUp() {
        reports = new ExtentReports();
        File file = new File("extentReport.html");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("file");
        reports.attachReporter(sparkReporter);


        log = Logger.getLogger(Base.class.getName());
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\soujanya.narlapuram\\IdeaProjects\\BookStore_Application\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        log.info("Browser Launched");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
        public void test1()
    {
            test = reports.createTest("Test Case 1", "The test case 1 has passed");
            Assert.assertTrue(true);
        }





    public void tearDown() {
        driver.close();
        log.info("Closing Browser");
        reports.flush();
    }



}
